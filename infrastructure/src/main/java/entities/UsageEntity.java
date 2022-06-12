package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UsageEntity {
    private String label;
    private BigDecimal montant;
    private LocalDate dateUsage;
    private boolean effectue;

    public UsageEntity(String label, BigDecimal montant, LocalDate dateUsage, boolean effectue) {
        this.label = label;
        this.montant = montant;
        this.dateUsage = dateUsage;
        this.effectue = effectue;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public boolean isEffectue() {
        return effectue;
    }

    public void setEffectue(boolean effectue) {
        this.effectue = effectue;
    }
}
