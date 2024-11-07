package org.ldv.apieurocoasters.model.DTO

import org.ldv.apieurocoasters.model.entity.Constructeur
import org.ldv.apieurocoasters.model.entity.Parc

class RollerCoastersDTO(
    val nom :String,
    val structure: String?,
    val type: String?,
    val dateOuverture : Int?,
    val hauteur : Float?,
    val constructeur : Constructeur?,
    val parc : Parc?,
    val compositions : List<CompositionDTO>?
) {
}