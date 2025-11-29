package ma.microserviceproduit.repository;

import ma.microserviceproduit.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
