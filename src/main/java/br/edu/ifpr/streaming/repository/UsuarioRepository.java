package br.edu.ifpr.streaming.repository;

import br.edu.ifpr.streaming.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
