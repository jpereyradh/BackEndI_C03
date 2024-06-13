package com.example.Apuestas.repository;

import com.example.Apuestas.entity.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartidoRepository extends MongoRepository<Partido,Long> {
    //aca van todas las consultas HQL manuales que pudieran generar
}
