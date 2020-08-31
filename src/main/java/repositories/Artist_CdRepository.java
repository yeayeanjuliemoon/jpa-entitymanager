package repositories;

import entities.Artist_Cd;
import entities.Cd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Artist_CdRepository extends JpaRepository<Artist_Cd, Long> {

    Optional<Artist_Cd> findById(Long id);
    List<Artist_Cd> findAll();
}
