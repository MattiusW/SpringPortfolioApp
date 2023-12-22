package com.mateuszwalczyk.production;

import com.mateuszwalczyk.production.controller.WorkerController;
import com.mateuszwalczyk.production.model.Master;
import com.mateuszwalczyk.production.model.Worker;
import com.mateuszwalczyk.production.repository.MasterRepository;
import com.mateuszwalczyk.production.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

@SpringBootApplication
public class ProductionApplication implements CommandLineRunner {

	@Autowired
	WorkerRepository workerRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Worker standardWorkerOne = new Worker.WorkerBuilder()
				.setName("Krzysiu")
				.setAbility("mechanik")
				.setPayment(new BigDecimal(3000.00).setScale(2, RoundingMode.HALF_UP))
				.buildWorker();

		Worker standardWorkerTwo = new Worker.WorkerBuilder()
				.setName("Marcin")
				.setAbility("operator")
				.setPayment(new BigDecimal(2000.00).setScale(2, RoundingMode.HALF_UP))
				.buildWorker();

		Worker standardWorkerThree = new Worker.WorkerBuilder()
				.setName("Rafal")
				.setAbility("operator")
				.setPayment(new BigDecimal(2000.00).setScale(2, RoundingMode.HALF_UP))
				.buildWorker();

		workerRepository.save(standardWorkerOne);
		workerRepository.save(standardWorkerTwo);
		workerRepository.save(standardWorkerThree);
	}
}
