package org.ldv.apieurocoasters.model.entity
import jakarta.persistence.*

@Entity
@Table(name="parcs")
class Parc(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val parcId  : Long,
    val nom :String,
    val dateOuverture: Int?,
    val superficie : Int?,

    @ManyToOne
    @JoinColumn(name = "fk_ville_id")
    val ville: Ville?){
}