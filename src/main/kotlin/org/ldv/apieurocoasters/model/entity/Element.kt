package org.ldv.apieurocoasters.model.entity
import jakarta.persistence.*

@Entity
@Table(name="elements")
class Element(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val elementId  : Long,
    val nom :String){
}