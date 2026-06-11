package br.edu.ifpr.streaming.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Serie extends Conteudo {

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL)
    private List<Episodio> episodios = new ArrayList<>();

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
}
