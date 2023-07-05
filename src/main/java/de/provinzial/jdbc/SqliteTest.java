package de.provinzial.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqliteTest {

    public static void main(String[] args) {

        try {
            ProductRepository repository = new ProductRepository();

            Product p1 = new Product();
            p1.setName("Milch");
            p1.setDescription("Bla bla bla");
            p1.setPrice(2.99);

            repository.insert(p1);

            List<Product> products = repository.find();
            printProducts(products);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printProducts(List<Product> products) {
        for(Product p : products) {
            System.out.println(p.getId() + ", " + p.getName());
        }
    }
}
