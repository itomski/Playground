package de.provinzial.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// Generisches Interface
// Der generische Typ wird auf Kindklassen von AbstractEntity eingeschränkt
public interface Repository<T extends AbstractEntity> { // AbstractEntity sichert zu, dass alle Objekte eine ID haben

    public List<T> find() throws SQLException;

    public T find(int id) throws SQLException;

    public boolean insert(T obj) throws SQLException;

    public boolean update(T obj) throws SQLException;

    public default boolean delete(T obj) throws SQLException {
        return delete(obj.getId());
    }

    public boolean delete(int id) throws SQLException;

    public void createTable() throws SQLException;

    public T create(ResultSet result) throws SQLException;

}
