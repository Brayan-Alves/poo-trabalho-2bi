package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    
}
