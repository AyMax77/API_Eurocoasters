package org.ldv.apieurocoasters.DAO

import org.ldv.apieurocoasters.model.entity.Constructeur
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ConstructeurDAO : JpaRepository<Constructeur,Long>{
}