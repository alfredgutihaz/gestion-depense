package com.usage.domain;

import lombok.Data;

import java.util.List;

@Data
public class Compte {
    private IdentifiantUtilisateur identifiantUtilisateur;
    private List<Usage> usages;

    void ajouterEntree(Entree entree) {
        this.usages.add(entree);
    }

    void ajouterDepense(Depense depense) {
        this.usages.add(depense);
    }

}
