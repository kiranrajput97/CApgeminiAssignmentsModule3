package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Trainee;
import com.cg.service.TraineeServiceI;



@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeServiceI traineeService;
	
	@PostMapping("/add")
	public ResponseEntity<Trainee> addTrainee(@RequestBody Trainee t) {
		traineeService.add(t);
		return new ResponseEntity<Trainee>(t,HttpStatus.OK);
	}
	
	@GetMapping("/getTrainee/{traineeId}")
    public ResponseEntity<Trainee> getTraineeId
              (@PathVariable("traineeId") int id) {
		
		Trainee t = traineeService.retrieve(id);
		if(t.getTraineeId()==id)
		{
			return new ResponseEntity<Trainee>(t,HttpStatus.OK);
		}
		return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteTrainee/{traineeId}")
    public ResponseEntity<Trainee> deleteTraineeId
              (@PathVariable("traineeId") int id) {
		if(traineeService.delete(id))
		{
			return new ResponseEntity<Trainee>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getTraineeDetails")
    public ResponseEntity<List<Trainee>> getAllBookDetails() {
			List<Trainee> lsttrainee = traineeService.reteriveAll();
			return new ResponseEntity<List<Trainee>>(lsttrainee,
					HttpStatus.OK);
	}
	
	@PostMapping("/modify")
	public ResponseEntity<Trainee> modifyTrainee(@RequestBody Trainee t) {
		traineeService.modify(t);
		return new ResponseEntity<Trainee>(t,HttpStatus.OK);
	}
}
