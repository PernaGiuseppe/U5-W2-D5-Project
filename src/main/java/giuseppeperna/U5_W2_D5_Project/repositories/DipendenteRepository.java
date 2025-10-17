package giuseppeperna.U5_W2_D5_Project.repositories;

import giuseppeperna.U5_W2_D5_Project.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    Optional<Dipendente> findByUsername(String username);
}
