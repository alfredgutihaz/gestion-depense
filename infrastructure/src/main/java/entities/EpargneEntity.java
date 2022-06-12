package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EpargneEntity {

    private BigDecimal montant;
    private LocalDate dateUsage;

    public EpargneEntity(BigDecimal montant, LocalDate dateUsage) {
        this.montant = montant;
        this.dateUsage = dateUsage;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDate getDateUsage() {
        return dateUsage;
    }

    public void setDateUsage(LocalDate dateUsage) {
        this.dateUsage = dateUsage;
    }
}
