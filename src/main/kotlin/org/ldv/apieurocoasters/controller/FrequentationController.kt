package org.ldv.apieurocoasters.controller
import org.ldv.apieurocoasters.DAO.ConstructeurDAO
import org.ldv.apieurocoasters.DAO.FrequentationDAO
import org.ldv.apieurocoasters.model.entity.Constructeur
import org.ldv.apieurocoasters.model.entity.Frequentation
import org.ldv.apieurocoasters.model.id.FrequentationId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/frequentations")
class FrequentationController(val frequentationdao: FrequentationDAO) {

    @GetMapping
    fun getAllFrequentation(): List<Frequentation> = frequentationdao.findAll()

    @GetMapping("/{annee}/{parcId}")
    fun getFrequentationById(
        @PathVariable annee:Int,
        @PathVariable parcId:Long
    ): Optional<Frequentation> {
        val frequentationId = FrequentationId(annee, parcId)
        return  frequentationdao.findById(frequentationId)
    }

}