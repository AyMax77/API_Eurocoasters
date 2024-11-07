package org.ldv.apieurocoasters.DAO
import org.ldv.apieurocoasters.model.entity.Parc
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParcDAO: JpaRepository<Parc,Long> {
}