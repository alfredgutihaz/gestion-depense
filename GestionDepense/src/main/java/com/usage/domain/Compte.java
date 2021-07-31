package com.usage.domain;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class Compte {
    private IdentifiantUtilisateur identifiantUtilisateur;
    private PorteFeuille porteFeuille;
    private Epargne epargne;
    private List<Note> notes;


    Montant soldePorteFeuillePrevisionnelMensuel(String mois, int annee) {
        return this.porteFeuille.soldePrevisionnelMensuel(mois,annee);
    }

    Montant soldePorteFeuilleReelMensuel(String mois, int annee) {
        return this.porteFeuille.soldeReelMensuel(mois, annee);
    }

    Montant soldePorteFeuillePrevisionnelAnnuel(int annee) {
        return this.porteFeuille.soldePrevisionnelAnnuel(annee);
    }

    Montant soldePortefeuilleReelAnnuel(int annee) {
        return this.porteFeuille.soldeReelAnnuel(annee);
    }

    Montant soldeEpargne() {
        return this.epargne.soldeEpargne();
    }

    void ajoutPorteFeuille(Entree entree) {
        this.porteFeuille.ajouterEntree(entree);
    }

    void retraitPortefeuille(Depense depense) {
        this.porteFeuille.ajouterDepense(depense);
    }
}
