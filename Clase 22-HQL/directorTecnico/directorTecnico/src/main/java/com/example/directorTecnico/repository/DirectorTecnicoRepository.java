package com.example.directorTecnico.repository;

import com.example.directorTecnico.entity.DirectorTecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DirectorTecnicoRepository extends JpaRepository<DirectorTecnico,Long> {



    List<DirectorTecnico> findByEdadGreaterThan(Integer edad);

    @Query("SELECT dt FROM DirectorTecnico dt WHERE dt.nombre=?1")
    Optional<DirectorTecnico> buscarTecnicoPorNombre(String nombre);
}
