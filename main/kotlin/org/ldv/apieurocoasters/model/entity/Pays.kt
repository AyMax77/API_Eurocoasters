package org.ldv.apieurocoasters.model.entity
import jakarta.persistence.*

@Entity
@Table(name="pays")
class Pays(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val paysId  : Long,
    val nom :String){
}