package com.mateuszwalczyk.production.controller;

import com.mateuszwalczyk.production.model.Machine;
import com.mateuszwalczyk.production.service.MachineService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MachineController {

    @Autowired
    MachineService machineService;

    @PostMapping("/post/machine")
    public Machine createMachine(@RequestBody Machine machine){
        return machineService.saveMachine(machine);
    }

    @RequestMapping("/machine/all")
    public List<Machine> getAllMachine(HttpServletResponse response){
        return machineService.getAllMachine();
    }
}
