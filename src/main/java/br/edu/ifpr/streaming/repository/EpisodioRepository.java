package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
    
}
