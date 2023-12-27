package com.Emsiprojet.commandes.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
@RefreshScope
public class ApplicationPropertiesConfiguration {
    private int limitDecommandes;
    public int getLimitDecommandes() {
        return limitDecommandes;
    }
    public void setLimitDecommandes(int limitDecommandes1) {
        this.limitDecommandes = limitDecommandes;
    }

}
