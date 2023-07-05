package de.provinzial.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static final String URL = "jdbc:sqlite:product.db";

    private ConnectionUtil() {
    }

    public static Connection get() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
