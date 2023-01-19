package com.lucas.hrworker.services;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.hrworker.dtos.WorkerDTO;
import com.lucas.hrworker.entities.Worker;
import com.lucas.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	WorkerRepository repo;

	public Collection<WorkerDTO> findAllWorkers() {
		return repo.findAll().stream().map(Worker::toDTO).collect(Collectors.toList());
	}

	public WorkerDTO findWorkerById(Long id) {
		return repo.findById(id).map(Worker::toDTO).get();
	}
}
