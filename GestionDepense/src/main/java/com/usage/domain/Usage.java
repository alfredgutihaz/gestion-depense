package com.usage.domain;

import java.time.LocalDate;

public abstract class Usage {
    protected String label;
    protected Montant montant;
    protected LocalDate dateUsage;
    protected boolean effectue;

    Montant addUsage(Usage usage) {
        this.montant.addMontant(usage.montant);
        return this.montant;
    }
}
