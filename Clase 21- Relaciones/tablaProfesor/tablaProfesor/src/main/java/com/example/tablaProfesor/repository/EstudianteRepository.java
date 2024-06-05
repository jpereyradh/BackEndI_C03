package com.example.tablaProfesor.repository;

import com.example.tablaProfesor.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
