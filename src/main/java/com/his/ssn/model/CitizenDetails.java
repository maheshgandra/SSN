package com.his.ssn.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CitizenDetails {
	
	private Integer citizenId;
	
	private String citizenName;
	
	private String ssn;
	
	private String address;
	
	private String phneNo;
	
	
  	


}
