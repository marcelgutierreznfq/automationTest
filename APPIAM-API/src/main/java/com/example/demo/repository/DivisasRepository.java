package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Divisas;

@Repository
public interface DivisasRepository  extends JpaRepository<Divisas, Integer>{

	 @Procedure(procedureName = "spTestAPI")
	 Divisas spTestAPI(@Param("Param1") String sISOCode);
	 
	 @Procedure(procedureName = "spTestAPI")
	 List<Divisas> spTestAPI();
	
}
