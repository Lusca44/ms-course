package com.lucas.hrworker.resources;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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

	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private WorkerService service;

	@Autowired
	private Environment env;
	
	@GetMapping
	public ResponseEntity<Collection<WorkerDTO>> findAllWorkers(){
		return ResponseEntity.ok(service.findAllWorkers());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<WorkerDTO> findWorkerById(@PathVariable("id") Long id){
		logger.info("PORT: " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok(service.findWorkerById(id));
	}
	
}
