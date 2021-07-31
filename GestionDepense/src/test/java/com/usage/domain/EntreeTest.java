package com.usage.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class EntreeTest {

    @Test
    void addMontantEntree(){
      Entree entree1 = Entree.builder()
                             .label("salaire")
                             .montant(Montant.MONTANT_ZERO)
                             .build();

      Entree entree2 = Entree.builder()
                             .label("epargne")
                             .montant(new Montant(BigDecimal.TEN))
                             .build();

      Montant montant = entree1.addUsage(entree2);
      Assertions.assertThat(montant.getValue()).isEqualTo(BigDecimal.TEN);
    }
}
