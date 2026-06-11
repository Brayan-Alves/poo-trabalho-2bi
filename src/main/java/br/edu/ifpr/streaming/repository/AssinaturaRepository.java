package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Assinatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinaturaRepository extends JpaRepository<Assinatura, Long> {
    
}
