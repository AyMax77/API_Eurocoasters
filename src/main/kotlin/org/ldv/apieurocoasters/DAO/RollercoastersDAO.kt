package org.ldv.apieurocoasters.DAO
import org.ldv.apieurocoasters.model.entity.Rollercoasters
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RollercoastersDAO: JpaRepository<Rollercoasters,Long> {
}