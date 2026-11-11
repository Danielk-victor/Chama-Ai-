package br.com.chamaai.catalogo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Fatia vertical de exemplo: listas usadas nos filtros de busca (RF06). */
@RestController
@RequestMapping("/api")
public class CatalogoController {

    public record CategoriaResposta(Long id, String nome) {}
    public record CidadeResposta(Long id, String nome, String uf) {}

    private final CategoriaRepository categorias;
    private final CidadeRepository cidades;

    public CatalogoController(CategoriaRepository categorias, CidadeRepository cidades) {
        this.categorias = categorias;
        this.cidades = cidades;
    }

    @GetMapping("/categorias")
    public List<CategoriaResposta> listarCategorias() {
        return categorias.findByAtivaTrueOrderByNomeAsc().stream()
                .map(c -> new CategoriaResposta(c.getId(), c.getNome())).toList();
    }

    @GetMapping("/cidades")
    public List<CidadeResposta> listarCidades() {
        return cidades.findAllByOrderByNomeAsc().stream()
                .map(c -> new CidadeResposta(c.getId(), c.getNome(), c.getUf())).toList();
    }
}
