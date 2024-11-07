package org.ldv.apieurocoasters.controller

import org.ldv.apieurocoasters.DAO.ParcDAO
import org.ldv.apieurocoasters.model.entity.Parc
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/parcs")
class ParcController(val parcDao:ParcDAO) {

    @GetMapping
    fun getAllParc(): List<Parc> = parcDao.findAll()

    @GetMapping("/{id}")
    fun getParcById(@PathVariable id:Long): Optional<Parc> = parcDao.findById(id)

}