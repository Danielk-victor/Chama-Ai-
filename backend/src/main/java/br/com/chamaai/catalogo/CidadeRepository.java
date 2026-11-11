package br.com.chamaai.catalogo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    List<Cidade> findAllByOrderByNomeAsc();
}
