package org.ldv.apieurocoasters.DAO

import org.ldv.apieurocoasters.model.entity.Composition
import org.ldv.apieurocoasters.model.id.CompositionId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompositionDAO : JpaRepository<Composition,CompositionId>{
}