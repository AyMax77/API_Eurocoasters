package org.ldv.apieurocoasters.controller
import org.ldv.apieurocoasters.DAO.VilleDAO
import org.ldv.apieurocoasters.model.entity.Pays
import org.ldv.apieurocoasters.model.entity.Ville
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/villes")
class VilleController(val villeDAO: VilleDAO) {

    @GetMapping
    fun getAllVille(): List<Ville> = villeDAO.findAll()

    @GetMapping("/{id}")
    fun getVilleById(@PathVariable id:Long): Optional<Ville> = villeDAO.findById(id)

}