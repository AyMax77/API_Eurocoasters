package org.ldv.apieurocoasters.controller
import org.ldv.apieurocoasters.DAO.ConstructeurDAO
import org.ldv.apieurocoasters.model.entity.Constructeur
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/constructeurs")
class ConstructeurController(val constructeurDAO: ConstructeurDAO) {

    @GetMapping
    fun getAllConstructeurs(): List<Constructeur> = constructeurDAO.findAll()

    @GetMapping("/{id}")
    fun getConstructeurById(@PathVariable id:Long): Optional<Constructeur> = constructeurDAO.findById(id)

}