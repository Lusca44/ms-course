package com.lucas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
