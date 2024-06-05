package com.example.tablaProfesor.repository;

import com.example.tablaProfesor.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}
