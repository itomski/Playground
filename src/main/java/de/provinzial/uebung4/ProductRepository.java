package de.provinzial.uebung4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        readFromFile();
    }

    public void add(Product product) {
        products.add(product);
        saveToFile();
    }

    public List<Product> getAll() {
        return products;
    }

    public List<Product> getAllSorted(Comparator<Product> comparator) {
        List<Product> sorted = new ArrayList<>(products);
        Collections.sort(sorted, comparator);
        return sorted;
    }

    public List<Product> getAll(LocalDate from, LocalDate to) {
        List<Product> list = new ArrayList<>(products);
        list.removeIf(p -> p.getInStockSince().isBefore(from));
        list.removeIf(p -> p.getInStockSince().isAfter(to));
        return list;
    }

    private void readFromFile() {
        Path pfad = Paths.get("data.ser");

        try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(pfad))) {
            products = (List<Product>) in.readObject();
        }
        catch(Exception e) {
            System.out.println("Es kann nicht gelesen werden!");
            products = new ArrayList<>();
        }
    }

    private void saveToFile() {

        Path pfad = Paths.get("data.ser");

        try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(pfad))) {
            out.writeObject(products);
        }
        catch(IOException e) {
            System.out.println("Es kann nicht gespeichert werden!");
        }
    }
}
