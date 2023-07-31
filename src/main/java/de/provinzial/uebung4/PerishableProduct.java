package de.provinzial.uebung4;

import java.time.LocalDate;

public class PerishableProduct extends Product {

    private LocalDate expiryDate;

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return String.format(TBL_ROW, getName(), getDescription(), getInStockSince(), getQuantity(), getPrice(), getExpiryDate());
    }
}
