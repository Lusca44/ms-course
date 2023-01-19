package com.lucas.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.lucas.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Tobirama" , 200D, days);
	}
	
}
