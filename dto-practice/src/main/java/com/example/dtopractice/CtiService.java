package com.example.dtopractice;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CtiService {

 List<CtiResponseDTO> getDetails();
	
 String getStatusByName(String ruleName);
	

}
