package com.mariana.aulas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mariana.aulas.model.AulaModel;
import com.mariana.aulas.model.TipoAula;
import com.mariana.aulas.repository.AulaRepository;

@Service
public class AulaService {
    
    @Autowired
    private  AulaRepository repository;
    
  //metodo para criar uma aula
  	public AulaModel saveAula(AulaModel aula) {
  		return repository.save(aula);
  	}
  	
    public List<AulaModel> getAula() {
        return repository.findAll();
    }
    
    public List<AulaModel> getAulasType(TipoAula tipoAula) {
        return repository.findByTipoAula(tipoAula);
    }
    
    public AulaModel getAulaById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Aula não encontrada"));
    }
    
  //método para atualizar por id
  	public AulaModel updateAula(Integer id, AulaModel aula) {
  		AulaModel aulaAtualizada =  repository.findById(id).get();;
  		aulaAtualizada.setMateriaURL(aulaAtualizada.getMateriaURL());
  		aulaAtualizada.setConteudo(aulaAtualizada.getConteudo());
  		aulaAtualizada.setTipoAula(aulaAtualizada.getTipoAula());;
  		return repository.save(aulaAtualizada);
  	}
  	
    
    public void deleteAula(Integer id) {
        repository.deleteById(id);
    }
}
