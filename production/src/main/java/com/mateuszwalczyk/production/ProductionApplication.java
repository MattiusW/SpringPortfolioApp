package com.mateuszwalczyk.production;

import com.mateuszwalczyk.production.model.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

@SpringBootApplication
public class ProductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductionApplication.class, args);

		Worker workerOne = new Worker.WorkerBuilder()
				.setId(1)
				.setName("Krzysiu")
				.setAbility("Operator")
				.setPayment(new BigDecimal(2000.00).setScale(2, RoundingMode.HALF_UP))
				.setLevel(1)
				.buildWorker();

		System.out.println(workerOne);
	}

}
