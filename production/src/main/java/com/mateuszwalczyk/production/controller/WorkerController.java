package com.mateuszwalczyk.production.controller;

import com.mateuszwalczyk.production.model.Worker;
import com.mateuszwalczyk.production.service.WorkerService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    WorkerService workerService;

    @PostMapping("/post/worker")
    public Worker createWorker(@RequestBody Worker worker){
        return workerService.saveWorker(worker);
    }

    @RequestMapping("/worker/all")
    public List<Worker> getAllWorkers(HttpServletResponse response){
        return workerService.getAllWorkers();
    }

}
