package testeDevJunior.demo.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testeDevJunior.demo.domain.RedeMT;

@Repository
public interface RedeMTRepository extends JpaRepository<RedeMT, Integer> {}
