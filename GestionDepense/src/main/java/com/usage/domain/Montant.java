package com.usage.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;

@Value
@AllArgsConstructor
public class Montant {
    BigDecimal value;
    static final Montant MONTANT_ZERO = new Montant(BigDecimal.ZERO);

    Montant addMontant(Montant montant) {
        return new Montant(this.value.add(montant.getValue()));
    }

    Montant negate() {
        return new Montant(this.value.negate());
    }

}
