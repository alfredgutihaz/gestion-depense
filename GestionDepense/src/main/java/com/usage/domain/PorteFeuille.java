package com.usage.domain;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static com.usage.domain.Montant.MONTANT_ZERO;

@Data
public class PorteFeuille {

    private List<Usage> usages = new ArrayList<>();

    Montant soldePrevisionnelMensuel(String mois, int annee) {
        return this.usages.stream()
                .filter(usage -> StringUtils.compareIgnoreCase(usage.getDateUsage().getMonth().name(), mois) == 0 &&
                        usage.getDateUsage().getYear() == annee)
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant soldeReelMensuel(String mois, int annee) {
        return this.usages.stream()
                .filter(usage -> StringUtils.compareIgnoreCase(usage.getDateUsage().getMonth().name(), mois) == 0 &&
                        usage.getDateUsage().getYear() == annee &&
                        usage.effectue)
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant soldePrevisionnelAnnuel(int annee) {
        return this.usages.stream()
                .filter(usage -> usage.getDateUsage().getYear() == annee)
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    Montant soldeReelAnnuel(int annee) {
        return this.usages.stream()
                .filter(usage -> usage.getDateUsage().getYear() == annee && usage.effectue)
                .map(Usage::getMontant)
                .reduce(MONTANT_ZERO, Montant::addMontant);
    }

    void ajouterEntree(Entree entree) {
        this.usages.add(entree);
    }

    void ajouterDepense(Depense depense) {
        this.usages.add(depense);
    }
}
