package testeDevJunior.demo.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testeDevJunior.demo.domain.Subestacao;

@Repository
public interface SubestacaoRepository extends JpaRepository<Subestacao, Integer> {
    boolean existsByCodigo(String codigo);
}

