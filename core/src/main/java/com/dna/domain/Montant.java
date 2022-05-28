package com.dna.domain;
import java.math.BigDecimal;

public class Montant {
    BigDecimal value;
    static final Montant MONTANT_ZERO = new Montant(BigDecimal.ZERO);

    public Montant(BigDecimal value) {
        this.value = value;
    }


    Montant addMontant(Montant montant) {
        return new Montant(this.value.add(montant.getValue()));
    }

    Montant substractMontant(Montant montant) {
        return new Montant(this.value.subtract(montant.getValue()));
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
