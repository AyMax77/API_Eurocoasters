package org.ldv.apieurocoasters.DAO
import org.ldv.apieurocoasters.model.entity.Pays
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaysDAO: JpaRepository<Pays,Long> {
}