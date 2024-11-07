package org.ldv.apieurocoasters.model.id
import jakarta.persistence.Embeddable
import java.io.Serializable
@Embeddable
class CompositionId(
    val rollercoastersId: Long,
    val elementId: Long
): Serializable {
}