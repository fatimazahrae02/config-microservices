package ma.commandesservice.feign;

import ma.commandesservice.Entity.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produits")   // ⚠️ même nom que spring.application.name du MS produits
public interface ProduitClient {

    @GetMapping("/api/produits")
    List<Produit> getAllProduits();

    @GetMapping("/api/produits/{id}")
    Produit getProduit(@PathVariable("id") Long id);
}
