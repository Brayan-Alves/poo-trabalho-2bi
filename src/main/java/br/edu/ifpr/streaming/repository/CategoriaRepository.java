package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
