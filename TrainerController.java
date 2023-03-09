package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Trainer;
@RestController
public class TrainerController {

	private Trainer trainer;

	public TrainerController(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	
	@GetMapping("/train")
	public void trainer()
	{
		trainer.myTrainer();
		
		
	}

	}

