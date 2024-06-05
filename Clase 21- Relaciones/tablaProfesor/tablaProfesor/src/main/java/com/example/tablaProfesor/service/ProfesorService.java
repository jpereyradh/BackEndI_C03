package com.example.tablaProfesor.service;

import com.example.tablaProfesor.entity.Profesor;
import com.example.tablaProfesor.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor guardarProfesor(Profesor profesor){
        return profesorRepository.save(profesor);
    }
    public void actualizarProfesor(Profesor profesor){
        profesorRepository.save(profesor);
    }
    public Optional<Profesor> buscarPorId(Long id){
        return profesorRepository.findById(id);
    }
    public List<Profesor> listarTodos(){
        return profesorRepository.findAll();
    }
    public void eliminarProfesor(Long id){
        profesorRepository.deleteById(id);
    }
}
