package com.usage.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class PorteFeuilleTest {

    @Test
    void testPortefeuille() {
        PorteFeuille porteFeuille = TestUtils.getTestPorteFeuille();
        Assertions.assertThat(porteFeuille.soldeReelMensuel("july",2021).getValue()).isEqualTo(BigDecimal.valueOf(2500));
        Assertions.assertThat(porteFeuille.soldeReelAnnuel(2021).getValue()).isEqualTo(BigDecimal.valueOf(2500));
        Assertions.assertThat(porteFeuille.soldePrevisionnelMensuel("AUgUsT",2022).getValue()).isEqualTo(BigDecimal.valueOf(-1000));
        Assertions.assertThat(porteFeuille.soldePrevisionnelAnnuel(2022).getValue()).isEqualTo(BigDecimal.valueOf(-1000));

    }


}
