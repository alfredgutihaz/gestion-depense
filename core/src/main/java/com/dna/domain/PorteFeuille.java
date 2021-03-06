package com.dna.domain;

public class PorteFeuille {

    private Depenses depenses = new Depenses();
    private Entrees entrees = new Entrees();

    void ajouterEntree(Entree entree) {
        this.entrees.ajouterEntree(entree);
    }

    void ajouterDepense(Depense depense) {
        this.depenses.ajouterDepense(depense);
    }

    Montant soldeReelMensuel(String mois, int annee) {
        Montant totalDepenseReelMensuel = this.depenses.getTotalDepenseEffectueeMensuelle(mois, annee);
        Montant totalEntreeReelMensuel = this.entrees.getTotalEntreeEffectueeMensuelle(mois, annee);
        return totalEntreeReelMensuel.substractMontant(totalDepenseReelMensuel);
    }

    Montant soldeReelAnnuel(int annee) {
        Montant totalDepenseReelAnnuel = this.depenses.getTotalDepenseEffectueeAnnuelle(annee);
        Montant totalEntreeReelAnnuel = this.entrees.getTotalDepenseEffectueeAnnuelle(annee);
        return totalEntreeReelAnnuel.substractMontant(totalDepenseReelAnnuel);
    }
}
