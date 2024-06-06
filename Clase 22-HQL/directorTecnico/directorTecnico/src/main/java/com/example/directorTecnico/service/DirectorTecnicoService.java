package com.example.directorTecnico.service;

import com.example.directorTecnico.entity.DirectorTecnico;
import com.example.directorTecnico.repository.DirectorTecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorTecnicoService {
    @Autowired
    private DirectorTecnicoRepository directorTecnicoRepository;


    public DirectorTecnico registrarDT(DirectorTecnico directorTecnico){
        return directorTecnicoRepository.save(directorTecnico);
    }
    public List<DirectorTecnico> buscarTecnicoMayorQue(Integer edad){
        return directorTecnicoRepository.findByEdadGreaterThan(edad);
   }
   public Optional<DirectorTecnico> buscarPorNombre(String nombre){
        return directorTecnicoRepository.buscarTecnicoPorNombre(nombre);
   }
}
