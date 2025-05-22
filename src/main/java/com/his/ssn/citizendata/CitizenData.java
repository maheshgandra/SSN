package com.his.ssn.citizendata;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.his.ssn.model.CitizenDetails;

@Component
public class CitizenData {

	public List<CitizenDetails> checkingCitizenData(String ssnNo, String phnNo) {
		
		List<CitizenDetails> citizenData = getCitizenData();
		List<CitizenDetails> list = citizenData.stream().filter(cit->cit.getSsn() == "ssnNo" && cit.getPhneNo() == "phnNo").toList();
		
		if (!list.isEmpty()) {
			return list;
		} else {
			return null;
		}
	}

	public List<CitizenDetails> getCitizenData() {

		List<CitizenDetails> l = new ArrayList<>();

		l.add(new CitizenDetails(1, "Mohan", "1234567890", "Hyderabad", "12345678"));
		l.add(new CitizenDetails(2, "Ravi", "1234567891", "Delhi", "12345679"));
		l.add(new CitizenDetails(3, "Sita", "1234567892", "Mumbai", "12345680"));
		l.add(new CitizenDetails(4, "Gita", "1234567893", "Chennai", "12345681"));
		l.add(new CitizenDetails(5, "Ramesh", "1234567894", "Kolkata", "12345682"));
		l.add(new CitizenDetails(6, "Suresh", "1234567895", "Bangalore", "12345683"));
		l.add(new CitizenDetails(7, "Kiran", "1234567896", "Pune", "12345684"));
		l.add(new CitizenDetails(8, "Anita", "1234567897", "Ahmedabad", "12345685"));
		l.add(new CitizenDetails(9, "Vikram", "1234567898", "Surat", "12345686"));
		l.add(new CitizenDetails(10, "Ruchi", "1234567899", "Lucknow", "12345687"));
		l.add(new CitizenDetails(11, "Anil", "1234567800", "Jaipur", "12345688"));
		l.add(new CitizenDetails(12, "Sunita", "1234567801", "Patna", "12345689"));
		l.add(new CitizenDetails(13, "Kavita", "1234567802", "Indore", "12345690"));
		l.add(new CitizenDetails(14, "Arun", "1234567803", "Bhopal", "12345691"));
		l.add(new CitizenDetails(15, "Deepa", "1234567804", "Nagpur", "12345692"));
		l.add(new CitizenDetails(16, "Prakash", "1234567805", "Vadodara", "12345693"));
		l.add(new CitizenDetails(17, "Jyoti", "1234567806", "Thane", "12345694"));
		l.add(new CitizenDetails(18, "Raj", "1234567807", "Agra", "12345695"));
		l.add(new CitizenDetails(19, "Lata", "1234567808", "Nashik", "12345696"));
		l.add(new CitizenDetails(20, "Naresh", "1234567809", "Faridabad", "12345697"));
		l.add(new CitizenDetails(21, "Bhavna", "1234567810", "Meerut", "12345698"));
		l.add(new CitizenDetails(22, "Sameer", "1234567811", "Rajkot", "12345699"));
		l.add(new CitizenDetails(23, "Meena", "1234567812", "Kalyan", "12345700"));
		l.add(new CitizenDetails(24, "Nikhil", "1234567813", "Vasai", "12345701"));
		l.add(new CitizenDetails(25, "Swati", "1234567814", "Varanasi", "12345702"));
		l.add(new CitizenDetails(26, "Harish", "1234567815", "Srinagar", "12345703"));
		l.add(new CitizenDetails(27, "Pooja", "1234567816", "Aurangabad", "12345704"));
		l.add(new CitizenDetails(28, "Yash", "1234567817", "Dhanbad", "12345705"));
		l.add(new CitizenDetails(29, "Manju", "1234567818", "Amritsar", "12345706"));
		l.add(new CitizenDetails(30, "Karan", "1234567819", "Allahabad", "12345707"));
		l.add(new CitizenDetails(31, "Neha", "1234567820", "Jodhpur", "12345708"));
		l.add(new CitizenDetails(32, "Imran", "1234567821", "Coimbatore", "12345709"));
		l.add(new CitizenDetails(33, "Fatima", "1234567822", "Madurai", "12345710"));
		l.add(new CitizenDetails(34, "Zaid", "1234567823", "Gwalior", "12345711"));
		l.add(new CitizenDetails(35, "Asha", "1234567824", "Vijayawada", "12345712"));
		l.add(new CitizenDetails(36, "Naveen", "1234567825", "Jabalpur", "12345713"));
		l.add(new CitizenDetails(37, "Alok", "1234567826", "Kota", "12345714"));
		l.add(new CitizenDetails(38, "Divya", "1234567827", "Ranchi", "12345715"));
		l.add(new CitizenDetails(39, "Parul", "1234567828", "Howrah", "12345716"));
		l.add(new CitizenDetails(40, "Sanjay", "1234567829", "Hubli", "12345717"));
		l.add(new CitizenDetails(41, "Reshma", "1234567830", "Mysore", "12345718"));
		l.add(new CitizenDetails(42, "Ajay", "1234567831", "Raipur", "12345719"));
		l.add(new CitizenDetails(43, "Tina", "1234567832", "Jalandhar", "12345720"));
		l.add(new CitizenDetails(44, "Om", "1234567833", "Noida", "12345721"));
		l.add(new CitizenDetails(45, "Isha", "1234567834", "Gurgaon", "12345722"));
		l.add(new CitizenDetails(46, "Ashok", "1234567835", "Ghaziabad", "12345723"));
		l.add(new CitizenDetails(47, "Preeti", "1234567836", "Shimla", "12345724"));
		l.add(new CitizenDetails(48, "Rahul", "1234567837", "Panaji", "12345725"));
		l.add(new CitizenDetails(49, "Sneha", "1234567838", "Udaipur", "12345726"));
		l.add(new CitizenDetails(50, "Vinay", "1234567839", "Trichy", "12345727"));

		return l;

	}
}
