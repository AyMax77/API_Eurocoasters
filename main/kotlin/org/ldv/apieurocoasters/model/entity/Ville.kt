package org.ldv.apieurocoasters.model.entity

import jakarta.persistence.*

@Entity
@Table(name="villes")
class Ville(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val villeId  : Long,
    val nom :String,

    @ManyToOne
    @JoinColumn(name = "fk_pays_id")
    val pays : Pays? ){
}