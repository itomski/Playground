package de.provinzial.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    final EntityManagerFactory factory;

    public ProductRepository(EntityManagerFactory factory) {
        this.factory = factory;
    }

    // CRUD
    public Optional<Product> find(int id) {
        // TODO: try-finally
        EntityManager manager = factory.createEntityManager();
        Product p = manager.find(Product.class, id);
        if(p != null) {
            return Optional.of(p);
        }
        return Optional.empty();
    }

    public List<Product> findAll() {
        // TODO: try-finally
        EntityManager manager = factory.createEntityManager();
        Query q = manager.createNamedQuery("Product.findAll");
        return q.getResultList();
    }

    public boolean delete(Product product) {
        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(Product.class, product.getId()));
            manager.getTransaction().commit();
            return true;
        }
        finally {
            manager.close();
        }
    }

    public boolean save(Product product) {
        if(product.getId() > 0) {
            return update(product);
        }
        else {
            return insert(product);
        }
    }

    private boolean insert(Product product) {
        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(product);
            manager.getTransaction().commit();
            return product.getId() > 0;
        }
        finally {
            manager.close();
        }
    }

    private boolean update(Product product) {
        // TODO: try-finally
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        // manager.persist(product);
        manager.getTransaction().commit();
        return true;
    }
}
