package com.devsuperior.hrworker.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WorkerNotFoundException  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public WorkerNotFoundException(String message) {
		super(message);
	}

}
