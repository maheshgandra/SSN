package com.his.ssn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.ssn.citizendata.CitizenData;
import com.his.ssn.model.CitizenDetails;


@RestController
@RequestMapping("/ssnno")
public class CitizenController {
	
	@Autowired
	private CitizenData citizenData;
	
	@GetMapping("/citizenDetails")
	public ResponseEntity<List<CitizenDetails>> postMethodName() {
		 List<CitizenDetails> checkingCitizenData = citizenData.checkingCitizenData("1234567890", "12345678");
		 
		if (checkingCitizenData == null) {
			
			return new ResponseEntity<>(null, HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<CitizenDetails>>(checkingCitizenData, HttpStatus.FOUND);

		}
		
	}
	
	@GetMapping("/path")
	public String getMethodName( String param) {
		return new String("Mohan");
	}	
	
}
	
