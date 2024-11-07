package org.ldv.apieurocoasters.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.ldv.apieurocoasters.model.id.FrequentationId

@Entity
@IdClass(FrequentationId::class)
@Table(name= "frequentations")
class Frequentation(
    @Id
    val annee:Int,
    @Id
    @Column(name="fk_parc_id")
    val parcId: Long,
    val nombreVisiteurs: Int?,

    @ManyToOne
    @JoinColumn(name = "fk_parc_id", insertable = false, updatable = false)
    val parc :Parc){
}