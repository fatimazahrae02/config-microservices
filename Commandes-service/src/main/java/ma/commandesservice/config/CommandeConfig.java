package ma.commandesservice.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Component
@ConfigurationProperties(prefix = "mes-config-ms")
public class CommandeConfig {

    private int commandesLast;

    public void setCommandesLast(int commandesLast) {
        this.commandesLast = commandesLast;
    }
}
