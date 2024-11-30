package com.mariana.aulas.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariana.aulas.model.AulaModel;
import com.mariana.aulas.model.TipoAula;

@Repository
public interface AulaRepository extends JpaRepository <AulaModel, Integer> {
	
	List<AulaModel> findByTipoAula(TipoAula tipoAula);

}
