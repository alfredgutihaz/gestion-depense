package com.usage.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper=true)
@Getter
public class Entree extends Usage {

    @Builder
    public Entree(String label, Montant montant, LocalDate dateUsage, boolean effectue) {
        super(label, montant, dateUsage, effectue);
    }
}
