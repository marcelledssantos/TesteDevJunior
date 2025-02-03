package testeDevJunior.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testeDevJunior.demo.Models.Subestacao;

@Repository
public interface SubestacaoRepository extends JpaRepository<Subestacao, Integer> {}

