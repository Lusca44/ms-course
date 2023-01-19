package com.lucas.hrworker.resources;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.hrworker.dtos.WorkerDTO;
import com.lucas.hrworker.services.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerService service;
	
	@GetMapping
	public ResponseEntity<Collection<WorkerDTO>> findAllWorkers(){
		return ResponseEntity.ok(service.findAllWorkers());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<WorkerDTO> findWorkerById(@PathVariable("id") Long id){
		return ResponseEntity.ok(service.findWorkerById(id));
	}
	
}
