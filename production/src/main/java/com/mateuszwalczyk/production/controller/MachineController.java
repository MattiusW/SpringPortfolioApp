package com.mateuszwalczyk.production.controller;

import com.mateuszwalczyk.production.model.Machine;
import com.mateuszwalczyk.production.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/machine")
public class MachineController {

    @Autowired
    MachineService machineService;

    @PostMapping
    public Machine createMachine(@RequestBody Machine machine){
        return machineService.saveMachine(machine);
    }

}
