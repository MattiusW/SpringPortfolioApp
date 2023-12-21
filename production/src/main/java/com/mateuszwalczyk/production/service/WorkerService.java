package com.mateuszwalczyk.production.service;

import com.mateuszwalczyk.production.model.Worker;
import com.mateuszwalczyk.production.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    @Autowired
    Worker worker;
    @Autowired
    private WorkerRepository workerRepository;

    public Worker saveWorker(Worker worker){
        return workerRepository.save(worker);
    }


}
