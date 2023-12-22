package com.mateuszwalczyk.production;
import com.mateuszwalczyk.production.controller.MachineController;
import com.mateuszwalczyk.production.controller.WorkerController;
import com.mateuszwalczyk.production.model.Machine;
import com.mateuszwalczyk.production.model.Worker;
import com.mateuszwalczyk.production.repository.WorkerRepository;
import com.mateuszwalczyk.production.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

@SpringBootApplication
public class ProductionApplication implements CommandLineRunner {

	@Autowired
	WorkerController workerController;

	@Autowired
	MachineController machineController;

	public static void main(String[] args) {
		SpringApplication.run(ProductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Worker standardWorkerOne = new Worker.WorkerBuilder()
				.setName("Krzysiu")
				.setAbility("mechanik")
				.setPayment(new BigDecimal(2000.00).setScale(2, RoundingMode.HALF_UP))
				.buildWorker();

		Worker standardWorkerTwo = new Worker.WorkerBuilder()
				.setName("Marcin")
				.setAbility("operator")
				.setPayment(new BigDecimal(1000.00).setScale(2, RoundingMode.HALF_UP))
				.buildWorker();


		workerController.createWorker(standardWorkerOne);
		workerController.createWorker(standardWorkerTwo);


		Machine machineTur = new Machine.MachineBuilder()
				.setName("Tur").buildMachine();

		Machine machineBracket = new Machine.MachineBuilder()
				.setName("Bracket").buildMachine();

		Machine machineWsporonik = new Machine.MachineBuilder()
				.setName("Wspornik").buildMachine();

		machineController.createMachine(machineTur);
		machineController.createMachine(machineBracket);
		machineController.createMachine(machineWsporonik);

	}

}
