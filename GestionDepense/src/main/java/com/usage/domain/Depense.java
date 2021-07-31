package com.usage.domain;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Getter
public class Depense extends Usage{


    @Builder
    public Depense(String label, Montant montant, LocalDate dateUsage, boolean effectue) {
        super(label, montant, dateUsage, effectue);
    }
}
