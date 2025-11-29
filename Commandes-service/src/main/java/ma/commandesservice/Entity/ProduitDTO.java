package ma.commandesservice.Entity;

import lombok.Data;

@Data
public class ProduitDTO {
    private Long id;
    private String nom;
    private double prix;
}
