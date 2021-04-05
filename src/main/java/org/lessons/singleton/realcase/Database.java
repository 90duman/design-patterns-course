package org.lessons.singleton.realcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project: DesignPatternsLessons<br/>
 * Class: org.lessons.singleton.realcase.Database.class<br/>
 * Description: ...<br/>
 *
 * @author axteel on 04.04.2021 : 03:48<br/>
 * @version 1.0<br/>
 */
public class Database {
    private static volatile Database instance = null;
    private volatile Connection connection;

    private Database() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (connection != null) {
                try {
                    System.out.println("Closing the connection");
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }));
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null)
                    instance = new Database();
            }
        }

        return instance;
    }

    public void init(DatasourceProperties properties) {
        try {
            this.connection = DriverManager
                    .getConnection(properties.getUrl(), properties.getUsername(), properties.getPassword());
            System.out.println("Successfully connected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void execute(String query) {
        System.out.println("Trying to execute");
        System.out.println(query);
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            System.out.println("Success");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
