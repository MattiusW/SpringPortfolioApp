package com.mateuszwalczyk.production.service;

import com.mateuszwalczyk.production.model.Machine;
import com.mateuszwalczyk.production.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineService {

    @Autowired
    MachineRepository machineRepository;

    public Machine saveMachine(Machine machine){
        return machineRepository.save(machine);
    }

    public List<Machine> getAllMachine(){
        return machineRepository.getAllMachine();
    }
}
