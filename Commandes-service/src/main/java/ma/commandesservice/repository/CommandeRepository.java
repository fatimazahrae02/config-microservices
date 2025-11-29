package ma.commandesservice.repository;

import ma.commandesservice.Entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

    List<Commande> findByDateBetween(LocalDate start, LocalDate end);

    List<Commande> findAllByOrderByDateAsc();
}
