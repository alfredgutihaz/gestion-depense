package com.dna.domain;

import java.time.LocalDate;

public class Entree extends Usage {

    public Entree(String label, Montant montant, LocalDate dateUsage, boolean effectue) {
        super(label, montant, dateUsage, effectue);
    }
}
