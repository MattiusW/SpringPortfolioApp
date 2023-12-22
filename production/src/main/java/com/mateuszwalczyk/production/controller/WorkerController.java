package com.mateuszwalczyk.production.controller;

import com.mateuszwalczyk.production.model.Worker;
import com.mateuszwalczyk.production.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WorkerController {

    @Autowired
    WorkerService workerService;

    @PostMapping
    public Worker createWorker(@RequestBody Worker worker){
        return workerService.saveWorker(worker);
    }

}