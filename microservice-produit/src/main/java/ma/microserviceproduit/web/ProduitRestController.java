package ma.microserviceproduit.web;

import lombok.RequiredArgsConstructor;
import ma.microserviceproduit.entity.Produit;
import ma.microserviceproduit.repository.ProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
@RequiredArgsConstructor
public class ProduitRestController {

    private final ProduitRepository produitRepository;

    @GetMapping
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produit getById(@PathVariable Long id) {
        return produitRepository.findById(id).orElse(null);
    }
}
