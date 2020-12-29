package br.com.leiros.api.crudbasico.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("aplicacao")
@Component
public class PropriedadesDaAplicacao {

    private String EndPointPermitido;

    public String getEndPointPermitido() {
        return EndPointPermitido;
    }

    public void setEndPointPermitido(String endPointPermitido) {
        this.EndPointPermitido = endPointPermitido;
    }
}
