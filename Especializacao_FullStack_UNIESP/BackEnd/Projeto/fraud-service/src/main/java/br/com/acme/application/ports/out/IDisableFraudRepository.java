package br.com.acme.application.ports.out;

import br.com.acme.application.domain.FraudDomain;

public interface IDisableFraudRepository {
    FraudDomain execute(String document);
}
