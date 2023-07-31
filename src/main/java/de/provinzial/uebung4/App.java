package de.provinzial.uebung4;

import java.time.LocalDate;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        /*
        Product product = new Product();
        product.setName("Tasse");
        product.setDescription("Keramik, gelb");
        product.setInStockSince(LocalDate.now());
        product.setPrice(5.99);
        product.setQuantity(10);

        repository.add(product);

        product = new Product();
        product.setName("Tasse");
        product.setDescription("Keramik, blau");
        product.setInStockSince(LocalDate.of(2000, 10, 17));
        product.setPrice(2.99);
        product.setQuantity(15);

        repository.add(product);

        PerishableProduct eproduct = new PerishableProduct();
        eproduct.setName("Hackfleisch");
        eproduct.setDescription("Rind");
        eproduct.setInStockSince(LocalDate.of(2023, 7, 20));
        eproduct.setExpiryDate(LocalDate.of(2023, 7, 30));
        eproduct.setPrice(2.99);
        eproduct.setQuantity(15);

        repository.add(eproduct);

        product = new Product();
        product.setName("Mütze");
        product.setDescription("100% Bio-Wolle");
        product.setInStockSince(LocalDate.of(2022, 10, 17));
        product.setPrice(19.99);
        product.setQuantity(100);

        repository.add(product);
        */

        for(Product p : repository.getAll()) {
            System.out.print(p);
        }

        System.out.println("-------------");

        Comparator<Product> byInStockSince = (a, b) -> a.getInStockSince().compareTo(b.getInStockSince());
        Comparator<Product> byQuantity = (a, b) -> a.getQuantity() - b.getQuantity();

        for(Product p : repository.getAllSorted(byInStockSince)) {
            System.out.print(p);
        }

        System.out.println("-------------");

        for(Product p : repository.getAll(LocalDate.now().minusDays(20), LocalDate.now().plusDays(10))) {
            System.out.print(p);
        }

    }
}
