package com.mateuszwalczyk.production.repository;

import com.mateuszwalczyk.production.model.Machine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineRepository extends CrudRepository<Machine, Long> {

    @Query("SELECT i FROM Machine i")
    public List<Machine> getAllMachine();

}
