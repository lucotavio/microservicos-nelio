package com.devsuperior.hrworker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.hrworker.entity.Worker;
import com.devsuperior.hrworker.exception.WorkerNotFoundException;
import com.devsuperior.hrworker.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll(){
		return repository.findAll();
	}
	
	public Worker findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new WorkerNotFoundException("Worker with id = " + id + " not found"));
	}

}
