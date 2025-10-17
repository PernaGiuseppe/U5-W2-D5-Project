package giuseppeperna.U5_W2_D5_Project.repositories;

import giuseppeperna.U5_W2_D5_Project.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Long> {
}
