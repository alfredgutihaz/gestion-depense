package com.usage.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CompteTest {

    @Test
    void TestCompte() {
        Compte compte = Compte.builder()
                               .epargne(TestUtils.getEpargneTest())
                               .porteFeuille(TestUtils.getTestPorteFeuille())
                               .build();
        Assertions.assertThat(compte.soldeEpargne().getValue()).isEqualTo(BigDecimal.valueOf(1500));
        Assertions.assertThat(compte.soldePorteFeuilleReelMensuel("july",2021).getValue()).isEqualTo(BigDecimal.valueOf(2500));
        Assertions.assertThat(compte.soldePorteFeuillePrevisionnelMensuel("aUgust",2022).getValue()).isEqualTo(BigDecimal.valueOf(-1000));
        Assertions.assertThat(compte.soldePortefeuilleReelAnnuel(2021).getValue()).isEqualTo(BigDecimal.valueOf(2500));
        Assertions.assertThat(compte.soldePorteFeuillePrevisionnelAnnuel(2022).getValue()).isEqualTo(BigDecimal.valueOf(-1000));

    }
}
