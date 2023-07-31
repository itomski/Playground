package de.provinzial.uebung4;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable {

    public static String TBL_ROW = "| %15s | %20s | %10s | %4s | %6.2f € | %10s | \n";

    private String name;
    private String description;
    private LocalDate inStockSince;
    private int quantity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInStockSince() {
        return inStockSince;
    }

    public void setInStockSince(LocalDate inStockSince) {
        this.inStockSince = inStockSince;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(TBL_ROW, name, description, inStockSince, quantity, price, "");
    }
}
