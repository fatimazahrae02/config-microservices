package ma.commandesservice.Entity;

import lombok.Data;

@Data
public class Produit {
    private Long id;
    private String nom;
    private Double prix;
}
