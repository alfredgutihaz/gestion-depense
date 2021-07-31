package com.usage.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@EqualsAndHashCode
@Getter
@SuperBuilder
public abstract class Usage {
    protected final String label;
    protected final Montant montant;
    protected final LocalDate dateUsage;
    protected final boolean effectue;

    protected  Usage(String label, Montant montant, LocalDate dateUsage, boolean effectue) {
        this.label = label;
        this.montant = montant;
        this.dateUsage = dateUsage;
        this.effectue = effectue;
    }

    Montant addUsage(Usage usage) {
      return this.montant.addMontant(usage.montant);
    }
}
