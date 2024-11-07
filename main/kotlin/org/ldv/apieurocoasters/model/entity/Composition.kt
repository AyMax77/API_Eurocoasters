package org.ldv.apieurocoasters.model.entity
import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*
import org.ldv.apieurocoasters.model.id.CompositionId

@Entity
@Table(name="compositions")
class Composition(
    @EmbeddedId
    val id :CompositionId,

    @ManyToOne
    @MapsId("rollercoastersId")
    @JoinColumn(name = "fk_rollercoasters_id")
    @JsonBackReference
    val rollercoaster : Rollercoasters,

    @ManyToOne
    @MapsId("elementId")
    @JoinColumn(name = "fk_element_id")
    @JsonBackReference
    val element : Element,

    val nombre :Int){
}