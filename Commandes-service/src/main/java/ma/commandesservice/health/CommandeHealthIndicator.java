package ma.commandesservice.health;

import ma.commandesservice.repository.CommandeRepository;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CommandeHealthIndicator implements HealthIndicator {

    private final CommandeRepository repo;

    public CommandeHealthIndicator(CommandeRepository repo) {
        this.repo = repo;
    }

    @Override
    public Health health() {
        long count = repo.count();
        if (count > 0) {
            return Health.up()
                    .withDetail("message", "Il y a " + count + " commande(s)")
                    .build();
        }
        return Health.down()
                .withDetail("message", "Aucune commande")
                .build();
    }
}
