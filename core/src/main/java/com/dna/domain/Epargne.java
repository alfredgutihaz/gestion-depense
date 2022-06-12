package com.dna.domain;
import java.time.LocalDate;

public class Epargne {

    private Montant montant;
    private LocalDate dateUsage;

    public Epargne(Montant montant, LocalDate dateUsage) {
        this.montant = montant;
        this.dateUsage = dateUsage;
    }
}
