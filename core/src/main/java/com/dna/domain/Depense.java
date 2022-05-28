package com.dna.domain;
import java.time.LocalDate;

public class Depense extends Usage{

    public Depense(String label, Montant montant, LocalDate dateUsage, boolean effectue) {
        super(label, montant, dateUsage, effectue);
    }
}
