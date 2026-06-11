package br.edu.ifpr.streaming.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Assinatura assinatura;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Perfil> perfis = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }
}
