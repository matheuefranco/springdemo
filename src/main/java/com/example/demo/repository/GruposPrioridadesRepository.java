package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.GruposPrioridades;

@Repository
public interface GruposPrioridadesRepository extends JpaRepository<GruposPrioridades, Long>{

}
