package com.example.Apuestas.service;

import com.example.Apuestas.entity.Partido;
import com.example.Apuestas.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public Partido registrarPartido(Partido partido){
        return partidoRepository.save(partido);
    }
}
