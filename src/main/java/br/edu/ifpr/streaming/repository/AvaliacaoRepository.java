package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
}
