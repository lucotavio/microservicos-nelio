package com.devsuperior.hrworker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.devsuperior.hrworker.entity.Worker;
import com.devsuperior.hrworker.repository.WorkerRepository;

@Component
public class DataBase {
	
	@Autowired
	private WorkerRepository repository;
	
	public void instancia() {
		
		Worker worker1 = Worker.builder().name("Bob").dailyIncome(200.00).build();
		Worker worker2= Worker.builder().name("Maria").dailyIncome(300.00).build();
		Worker worker3 = Worker.builder().name("Alex").dailyIncome(250.00).build();
		
		repository.save(worker1);
		repository.save(worker2);
		repository.save(worker3);
				
	}

}
