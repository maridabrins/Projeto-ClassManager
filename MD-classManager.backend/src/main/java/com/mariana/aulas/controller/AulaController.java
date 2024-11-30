package com.mariana.aulas.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariana.aulas.model.AulaModel;
import com.mariana.aulas.model.TipoAula;
import com.mariana.aulas.service.AulaService;

@RequestMapping("/aulas")
@RestController
public class AulaController {
    
    @Autowired
    private AulaService service;

    // Endpoint para listar todas as aulas
    @GetMapping
    public List<AulaModel> getAulas(){
        return service.getAula();
    }

    // Endpoint para listar aulas por tipo
    @GetMapping("/tipo/{tipoAula}")
    public List<AulaModel> listarAulasPorTipo(@PathVariable TipoAula tipoAula) {
        return service.getAulasType(tipoAula);
    }

    // Endpoint para buscar aula por ID
    @GetMapping("/{id}")
    public AulaModel getAula(@PathVariable int id) {
        return service.getAulaById(id);
    }

    // Endpoint para criar uma nova aula
    @PostMapping("/criar-nova")
    public AulaModel createAula(@RequestBody AulaModel aula) {
    	return service.saveAula(aula);
    }


    @PutMapping("/editar/{id}")
    public AulaModel updateAula(@PathVariable Integer id, @RequestBody AulaModel aula) {
 	   return service.updateAula(id, aula);
    }

    // Endpoint para deletar uma aula
    @DeleteMapping("/deletar/{id}")
    public void deleteAula(@PathVariable int id) {
        service.deleteAula(id);
    }
}
