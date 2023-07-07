package de.provinzial.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProduktVerwaltungPU");

        ProductRepository repository = new ProductRepository(factory);
        // FIND ALL
        for(Product p : repository.findAll()) {
            System.out.println(p);
        }

        System.out.println();

        // FIND ONE
        Optional<Product> opt = repository.find(1);

        //Consumer<Product> : void accept(T t)
        opt.ifPresent(p -> System.out.println(p));

        // INSERT
        Product p = new Product();
        p.setName("Handschuhe");
        p.setDescription("...");
        p.setPrice(19.99);

        if(repository.save(p)) {
            System.out.println("Gespeichert!");
        }

        // DELETE
        if(repository.delete(opt.get())) {
            System.out.println("Gelöscht!");
        }

        // EDIT


        factory.close();
    }
}
