package com.dna.domain;
import java.time.LocalDate;


public abstract class Usage {
    protected final String label;
    protected final Montant montant;
    protected final LocalDate dateUsage;
    protected final boolean effectue;

    public String getLabel() {
        return label;
    }

    public Montant getMontant() {
        return montant;
    }

    public LocalDate getDateUsage() {
        return dateUsage;
    }

    public boolean isEffectue() {
        return effectue;
    }

    public Usage(String label, Montant montant, LocalDate dateUsage, boolean effectue) {
        this.label = label;
        this.montant = montant;
        this.dateUsage = dateUsage;
        this.effectue = effectue;
    }

}
