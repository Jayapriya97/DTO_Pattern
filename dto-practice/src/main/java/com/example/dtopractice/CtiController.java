package com.example.dtopractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


//import org.springframework.;

@RestController
public class CtiController {
	
	@Autowired
	CtiService ctiService;
	
	@GetMapping("/api/cti")
	  List<CtiResponseDTO> getDetail(){
	    return ctiService.getDetails();
	  }
	
	@GetMapping("/api/{ruleName}")
	public ResponseEntity<String> getStatusByName(String ruleName){
		return ResponseEntity.ok().body(ctiService.getStatusByName(ruleName).toString());
		
	}

}
