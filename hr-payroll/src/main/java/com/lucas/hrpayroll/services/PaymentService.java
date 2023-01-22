package com.lucas.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.hrpayroll.client.WorkerClient;
import com.lucas.hrpayroll.client.WorkerFeignClient;
import com.lucas.hrpayroll.entities.Payment;
import com.lucas.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	//@Autowired
	//private WorkerClient workerClient;
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {
		//Worker worker = workerClient.getWorkerById(workerId);
		
		Worker worker = new Worker().fromDTO(workerFeignClient.findWorkerById(workerId).getBody());
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}

}
