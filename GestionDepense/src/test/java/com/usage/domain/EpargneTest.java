package com.usage.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class EpargneTest {

    @Test
    void TestSoldeEpargne() {
        Epargne epargne = TestUtils.getEpargneTest();
        Assertions.assertThat(epargne.soldeEpargne().getValue()).isEqualTo(new BigDecimal(1500));
    }
}
