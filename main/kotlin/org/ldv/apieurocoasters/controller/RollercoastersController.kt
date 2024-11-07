package org.ldv.apieurocoasters.controller
import org.ldv.apieurocoasters.DAO.RollercoastersDAO
import org.ldv.apieurocoasters.model.DTO.CompositionDTO
import org.ldv.apieurocoasters.model.DTO.RollerCoastersDTO
import org.ldv.apieurocoasters.model.entity.Rollercoasters
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("/rollercoasters")
class RollercoastersController(val rollercoastersDao:RollercoastersDAO) {

    @GetMapping
    fun getAllRollercoasters(): List<Rollercoasters> = rollercoastersDao.findAll()

    @GetMapping("/{id}")
    fun getRollercoastersById(@PathVariable id: Long): ResponseEntity<RollerCoastersDTO> {
        val rollercoaster = rollercoastersDao.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Rollercoaster non trouvé ! ")
        }
        val compositionsDTOs = mutableListOf<CompositionDTO>()
        for (composition in rollercoaster.compositions){
            val compositionDTO = CompositionDTO(
                elementNom = composition.element.nom,
                nombre = composition.nombre
            )
            compositionsDTOs.add(compositionDTO)
        }

        val rollercoastersDTO = RollerCoastersDTO(
            nom = rollercoaster.nom,
            structure = rollercoaster.structure,
            type =  rollercoaster.type,
            dateOuverture = rollercoaster.dateOuverture,
            hauteur = rollercoaster.hauteur,
            constructeur = rollercoaster.constructeur,
            parc = rollercoaster.parc,
            compositions = compositionsDTOs
        )
        return ResponseEntity.ok(rollercoastersDTO)
    }
}