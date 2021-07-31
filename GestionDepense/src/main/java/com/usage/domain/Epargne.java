package com.usage.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

import static com.usage.domain.Montant.MONTANT_ZERO;

@Data
@Builder
public class Epargne {

    private List<Usage> usages;

    Montant soldeEpargne() {
        return usages.stream()
                     .map(usage -> usage.montant)
                     .reduce(MONTANT_ZERO, Montant::addMontant);
    }
}
