package org.ldv.apieurocoasters.DAO
import org.ldv.apieurocoasters.model.entity.Ville
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VilleDAO: JpaRepository<Ville,Long> {
}