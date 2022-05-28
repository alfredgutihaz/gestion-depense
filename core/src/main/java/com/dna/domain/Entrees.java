package com.dna.domain;

import java.util.ArrayList;
import java.util.List;

import static com.dna.domain.Montant.MONTANT_ZERO;

public class Entrees {
    private List<Entree> entrees;

    public Entrees() {
        this.entrees = new ArrayList<>();
    }
    public Entrees(List<Entree> entrees) {
        this.entrees = entrees;
    }

    public void ajouterEntree(Entree entree) {
        this.entrees.add(entree);
    }

    Montant getTotalEntreePrevisionnelMensuelle(String mois, int annee) {
        return this.entrees.stream()
                .filter(entree -> mois.compareToIgnoreCase(entree.getDateUsage().getMonth().name()) == 0 &&
                        entree.getDateUsage().getYear() == annee)
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant getTotalEntreeEffectueeMensuelle(String mois, int annee) {
        return this.entrees.stream()
                .filter(entree -> mois.compareToIgnoreCase(entree.getDateUsage().getMonth().name()) == 0 &&
                        entree.getDateUsage().getYear() == annee &&
                        entree.isEffectue())
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant getTotalDepensePrevisionnelAnnuelle(int annee) {
        return this.entrees.stream()
                .filter(entree -> entree.getDateUsage().getYear() == annee)
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant getTotalDepenseEffectueeAnnuelle(int annee) {
        return this.entrees.stream()
                .filter(entree -> entree.getDateUsage().getYear() == annee &&
                        entree.isEffectue())
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

}
