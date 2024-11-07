package org.ldv.apieurocoasters.DAO

import org.ldv.apieurocoasters.model.entity.Frequentation
import org.ldv.apieurocoasters.model.id.FrequentationId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FrequentationDAO : JpaRepository<Frequentation,FrequentationId>{
}