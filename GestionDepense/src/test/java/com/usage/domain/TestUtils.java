package com.usage.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtils {

    public static PorteFeuille getTestPorteFeuille() {
        PorteFeuille porteFeuille = new PorteFeuille();

        Entree entree1 = Entree.builder()
                .label("salaire")
                .montant(new Montant(BigDecimal.valueOf(2000)))
                .dateUsage(LocalDate.of(2021, 07, 11))
                .effectue(true)
                .build();

        Entree entree2 = Entree.builder()
                .label("salaire")
                .montant(new Montant(BigDecimal.valueOf(2000)))
                .dateUsage(LocalDate.of(2021, 07, 11))
                .effectue(true)
                .build();

        porteFeuille.ajouterEntree(entree1);
        porteFeuille.ajouterEntree(entree2);
        Entree entree3 = new Entree("salaire", new Montant(BigDecimal.valueOf(1000)), LocalDate.of(2022, 8, 11), false);
        porteFeuille.ajouterEntree(entree3);

        Depense depense1 = new Depense("EDF", new Montant(BigDecimal.valueOf(-500)), LocalDate.of(2021, 07, 11), true);
        porteFeuille.ajouterDepense(depense1);
        Depense depense2 = new Depense("loyer", new Montant(BigDecimal.valueOf(-1000)), LocalDate.of(2021, 07, 11), true);
        porteFeuille.ajouterDepense(depense2);
        Depense depense3 = new Depense("loyer", new Montant(BigDecimal.valueOf(-2000)), LocalDate.of(2022, 8, 11), false);
        porteFeuille.ajouterDepense(depense3);

        return porteFeuille;
    }


    public static List<Usage> getUsageTest() {
        List<Usage> usages = new ArrayList<>();
        Entree entree1 = Entree.builder()
                .label("salaire")
                .montant(new Montant(BigDecimal.valueOf(2000)))
                .dateUsage(LocalDate.of(2021, 07, 11))
                .effectue(true)
                .build();

        Entree entree2 = Entree.builder()
                .label("salaire")
                .montant(new Montant(BigDecimal.valueOf(2000)))
                .dateUsage(LocalDate.of(2021, 07, 11))
                .effectue(true)
                .build();
        Entree entree3 = new Entree("salaire", new Montant(BigDecimal.valueOf(1000)), LocalDate.of(2022, 8, 11), false);
        Depense depense1 = new Depense("EDF", new Montant(BigDecimal.valueOf(-500)), LocalDate.of(2021, 07, 11), true);
        Depense depense2 = new Depense("loyer", new Montant(BigDecimal.valueOf(-1000)), LocalDate.of(2021, 07, 11), true);
        Depense depense3 = new Depense("loyer", new Montant(BigDecimal.valueOf(-2000)), LocalDate.of(2022, 8, 11), false);
        usages.addAll(Arrays.asList(entree1,entree2,entree3, depense1, depense2,  depense3));
        return usages;
    }

    public static Epargne getEpargneTest() {
        return Epargne.builder()
                .usages(getUsageTest())
                .build();
    }
}
