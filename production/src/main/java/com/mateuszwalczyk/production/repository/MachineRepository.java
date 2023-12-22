package com.mateuszwalczyk.production.repository;

import com.mateuszwalczyk.production.model.Machine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends CrudRepository<Machine, Long> {
}
