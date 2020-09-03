package cds.repositories;

import cds.entities.Cd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CdRepository extends JpaRepository<Cd, Long> {

    Optional<Cd> findById(Long id);
    List<Cd> findAll();

}
