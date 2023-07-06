package de.provinzial.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProduktVerwaltungPU");
        EntityManager manager = factory.createEntityManager();

        Product product = new Product();
        product.setName("Tasse");
        product.setDescription("Keramik blau ...");
        product.setPrice(5.99);
        product.setCreatedAt(LocalDateTime.now());

        Customer customer = new Customer();
        customer.setFirstname("Peter");
        customer.setLastname("Parker");

        product.setCustomer(customer);

        manager.getTransaction().begin();

        manager.persist(customer);
        manager.persist(product);

        manager.getTransaction().commit();

        //Product p = manager.find(Product.class, 1);
        //System.out.println(p);

        manager.close();
        factory.close();
    }
}
