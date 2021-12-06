package com.example.dtopractice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class CtiServiceImpl implements CtiService{
	
	@Autowired
	CtiRepository ctiRepository;

	@Override
	public List<CtiResponseDTO> getDetails() {
		// TODO Auto-generated method stub
		return this.ctiRepository.findAll();
	}

	@Override
	public String getStatusByName(String ruleName) {
		// TODO Auto-generated method stub
		Optional<CtiResponseDTO> ctiResponseDTO = Optional.of(this.ctiRepository.getById(ruleName));
		CtiResponseDTO ctiStatus = ctiResponseDTO.get();
		return ctiStatus.getStatus();
	}

}
