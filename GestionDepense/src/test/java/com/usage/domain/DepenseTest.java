package com.usage.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class DepenseTest {

    @Test
    void addMontantDepense(){
        Depense depense1 = Depense.builder()
                                  .label("facture telephone")
                                  .montant(new Montant(new BigDecimal(-20)))
                                  .build();

        Depense depense2 = Depense.builder()
                                  .label("electricite")
                                  .montant(new Montant(new BigDecimal(-20)))
                                  .build();

        Montant montant = depense1.addUsage(depense2);
        Assertions.assertThat(montant.getValue()).isEqualTo(new BigDecimal(-40));
    }
}
