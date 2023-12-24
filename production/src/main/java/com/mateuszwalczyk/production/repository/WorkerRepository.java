package com.mateuszwalczyk.production.repository;

import com.mateuszwalczyk.production.model.Worker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, Long> {

    @Query("SELECT i FROM Worker i")
    public List<Worker> getAllWorkers();

}
