package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    
}
