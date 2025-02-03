package testeDevJunior.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testeDevJunior.demo.Models.RedeMT;

@Repository
public interface RedeMTRepository extends JpaRepository<RedeMT, Integer> {
}
