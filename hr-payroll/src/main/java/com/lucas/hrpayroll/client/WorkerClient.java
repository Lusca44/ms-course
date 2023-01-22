package com.lucas.hrpayroll.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.lucas.hrpayroll.entities.Worker;

@Component
public class WorkerClient {

	//@Value("${hr-worker.host}")
	//private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	//public Worker getWorkerById(Long workerId) {
		//Map<String, String> uriVariables = new HashMap<>();
		//uriVariables.put("id", String.valueOf(workerId));
		//return restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
	//}
	
}
