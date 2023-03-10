package com.lucas.hrpayroll.entities;

import java.io.Serializable;
import com.lucas.hrpayroll.dtos.WorkerDTO;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double dailyIncome;

	public Worker() {
	}

	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	
	public WorkerDTO toDTO() {
		return new WorkerDTO(this.id, this.name, this.dailyIncome);
	}
	
	public Worker fromDTO(WorkerDTO dto) {
		return new Worker(dto.getId(),dto.getName(),dto.getDailyIncome());
	}
}
