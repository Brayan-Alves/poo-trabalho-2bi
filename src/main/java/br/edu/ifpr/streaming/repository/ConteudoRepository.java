package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Conteudo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConteudoRepository extends JpaRepository<Conteudo, Long> {
    
}
