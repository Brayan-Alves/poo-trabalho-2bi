package br.edu.ifpr.streaming.model;

import jakarta.persistence.*;

@Entity
public class Assinatura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plano;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
