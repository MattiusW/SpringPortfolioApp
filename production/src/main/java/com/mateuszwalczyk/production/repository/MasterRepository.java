package com.mateuszwalczyk.production.repository;

import com.mateuszwalczyk.production.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.CachedRowSet;

@Repository
public interface MasterRepository extends CrudRepository<Master,Long> {
}
