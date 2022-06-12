package entities;

import java.util.List;

public class CompteEntity {

    private String identfiantUtilisateur;
    private String numeroCompte;
    private List<UsageEntity> depenses;
    private List<UsageEntity> entrees;
    private EpargneEntity epargne;
    private List<String> notes;
}
