package org.ldv.apieurocoasters.DAO

import org.ldv.apieurocoasters.model.entity.Element
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ElementsDAO : JpaRepository<Element,Long>{
}