package com.dna.domain;

import java.util.List;

public class Compte {

    private IdentifiantUtilisateur identifiantUtilisateur;
    private PorteFeuille porteFeuille;
    private Epargne epargne;
    private List<Note> notes;

    public Compte(IdentifiantUtilisateur identifiantUtilisateur, PorteFeuille porteFeuille, Epargne epargne, List<Note> notes) {
        this.identifiantUtilisateur = identifiantUtilisateur;
        this.porteFeuille = porteFeuille;
        this.epargne = epargne;
        this.notes = notes;
    }

    void ajoutPorteFeuille(Entree entree) {
        this.porteFeuille.ajouterEntree(entree);
    }

    void retraitPortefeuille(Depense depense) {
        this.porteFeuille.ajouterDepense(depense);
    }
}
