package br.edu.ifpr.streaming.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Conteudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToMany
    @JoinTable(
        name = "conteudo_categoria",
        joinColumns = @JoinColumn(name = "conteudo_id"),
        inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria> categorias = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
}
