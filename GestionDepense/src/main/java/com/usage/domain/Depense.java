package com.usage.domain;

import lombok.Getter;

@Getter
public class Depense extends Usage{

    Montant getMontant() {
       return this.montant.negate();
    }
}
