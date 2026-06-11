package br.edu.ifpr.streaming;

import br.edu.ifpr.streaming.model.*;
import br.edu.ifpr.streaming.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UsuarioRepository usuarioRepository;
    private final AssinaturaRepository assinaturaRepository;
    private final PerfilRepository perfilRepository;
    private final AvaliacaoRepository avaliacaoRepository;
    private final CategoriaRepository categoriaRepository;
    private final FilmeRepository filmeRepository;
    private final SerieRepository serieRepository;
    private final EpisodioRepository episodioRepository;

    public DataLoader(UsuarioRepository usuarioRepository, AssinaturaRepository assinaturaRepository, PerfilRepository perfilRepository, AvaliacaoRepository avaliacaoRepository, CategoriaRepository categoriaRepository, FilmeRepository filmeRepository,SerieRepository serieRepository, EpisodioRepository episodioRepository) {
        this.usuarioRepository = usuarioRepository; 
        this.assinaturaRepository = assinaturaRepository;
        this.perfilRepository = perfilRepository;
        this.avaliacaoRepository = avaliacaoRepository;
        this.categoriaRepository = categoriaRepository;
        this.filmeRepository = filmeRepository;
        this.serieRepository = serieRepository;
        this.episodioRepository = episodioRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria acao = new Categoria();
        acao.setNome("Ação");
        categoriaRepository.save(acao);

        Filme filme = new Filme();
        filme.setTitulo("Matrix");
        filme.getCategorias().add(acao);
        filmeRepository.save(filme);

        Serie serie = new Serie();
        serie.setTitulo("Breaking Bad");
        serie.getCategorias().add(acao);
        serieRepository.save(serie);

         Episodio ep1 = new Episodio();
        ep1.setTitulo("Piloto");
        ep1.setSerie(serie);
        episodioRepository.save(ep1);

        Episodio ep2 = new Episodio();
        ep2.setTitulo("Gato no Saco");
        ep2.setSerie(serie);
        episodioRepository.save(ep2);

        Usuario usuario = new Usuario();
        usuario.setNome("Brayan");
        usuario.setEmail("brayan@email.com");
        usuarioRepository.save(usuario);

        Assinatura assinatura = new Assinatura();
        assinatura.setPlano("Premium");
        assinatura.setUsuario(usuario);
        assinaturaRepository.save(assinatura);

        Perfil perfil = new Perfil();
        perfil.setApelido("Brayan");
        perfil.setUsuario(usuario);
        perfilRepository.save(perfil);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNota(10);
        avaliacao.setComentario("Obra prima!");
        avaliacao.setPerfil(perfil);
        avaliacaoRepository.save(avaliacao);

        System.out.println("Dados inseridos com sucesso");
    }
}
