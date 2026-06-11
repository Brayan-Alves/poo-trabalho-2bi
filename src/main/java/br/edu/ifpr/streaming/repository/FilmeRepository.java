package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    
}
