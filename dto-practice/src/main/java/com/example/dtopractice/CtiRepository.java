package com.example.dtopractice;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CtiRepository extends JpaRepository<CtiResponseDTO, String>{

}
