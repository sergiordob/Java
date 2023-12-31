package br.com.acme.application.ports.in;

import br.com.acme.application.domain.entity.CardDomain;

import java.util.List;

public interface IListCardsAvailableClientUseCase {
    List<CardDomain> execute(String income);
}
