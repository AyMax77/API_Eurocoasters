package org.ldv.apieurocoasters.model.entity

import jakarta.persistence.*

@Entity
@Table(name= "constructeurs")
class Constructeur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val constructeursId: Long,
    val nom:String,
    val adresse : String?,
    val urlSiteWeb: String?,
    val urlFacebook: String?,
    val urlInstagram: String?,
    val urlLinkedIn: String?,
    val dateCreation: Int?,

    @ManyToOne
    @JoinColumn(name = "fk_ville_id")
    val ville : Ville?
) {
}