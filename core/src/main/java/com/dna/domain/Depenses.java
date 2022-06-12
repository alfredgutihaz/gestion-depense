package com.dna.domain;

import java.util.ArrayList;
import java.util.List;

import static com.dna.domain.Montant.MONTANT_ZERO;

public class Depenses {
    private List<Depense> depenses;

    public Depenses() {
        this.depenses = new ArrayList<>();
    }

    public Depenses(List<Depense> depenses) {
        this.depenses = depenses;
    }

    public void ajouterDepense(Depense depense) {
        this.depenses.add(depense);
    }


    Montant getTotalDepenseEffectueeMensuelle(String mois, int annee) {
        return this.depenses.stream()
                .filter(depense -> mois.compareToIgnoreCase(depense.getDateUsage().getMonth().name()) == 0 &&
                        depense.getDateUsage().getYear() == annee &&
                        depense.isEffectue())
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant getTotalDepenseEffectueeAnnuelle(int annee) {
        return this.depenses.stream()
                .filter(depense -> depense.getDateUsage().getYear() == annee &&
                        depense.isEffectue())
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

}
