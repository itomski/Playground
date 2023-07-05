package de.provinzial.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {

    private final String TABLE = "products";

    public ProductRepository() throws SQLException {
        createTable();
    }

    @Override
    public List<Product> find() throws SQLException {

        List<Product> products = new ArrayList<>();

        try(Connection con = ConnectionUtil.get(); /* Verbindung aufbauen */
            Statement stmt = con.createStatement(); /* Anfrage vorbereiten */) {

            // Anfrage absenden und Results einfangen
            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE);

            while(results.next()) { // Zeilenweise Bewegung durch die Datensätze
                // Relationale Daten in Objekte umwandeln
                // Objekte werden in einer Liste gesammelt
                products.add(create(results));
            }
            return products;
        }
    }

    @Override
    public Product find(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean insert(Product obj) throws SQLException {

        try(Connection con = ConnectionUtil.get();
            Statement stmt = con.createStatement()) {

            // TODO: Gegen SQLInjection absichern
            final String SQL = "INSERT INTO " + TABLE + " (id, name, description, price) VALUES(null, '%s', '%s', " + obj.getPrice() + ")";
            return stmt.executeUpdate(String.format(SQL, obj.getName(), obj.getDescription())) > 0;
        }
    }

    @Override
    public boolean update(Product obj) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        try(Connection con = ConnectionUtil.get();
            Statement stmt = con.createStatement()) {

            final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    @Override
    public void createTable() throws SQLException {
        try(Connection con = ConnectionUtil.get();
            Statement stmt = con.createStatement()) {

            final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + "  (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name TEXT NOT NULL," +
                    "description TEXT NOT NULL," +
                    "price DOUBLE NOT NULL)";

            stmt.executeUpdate(SQL);
        }
    }

    @Override
    public Product create(ResultSet result) throws SQLException {
        Product product = new Product();
        product.setId(result.getInt("id"));
        product.setName(result.getString("name"));
        product.setDescription(result.getString("description"));
        product.setPrice(result.getDouble("price"));
        return product;
    }
}
