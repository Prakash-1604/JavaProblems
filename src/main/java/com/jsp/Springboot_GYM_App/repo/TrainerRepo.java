package com.jsp.Springboot_GYM_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Springboot_GYM_App.dto.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer, Integer>{

}
