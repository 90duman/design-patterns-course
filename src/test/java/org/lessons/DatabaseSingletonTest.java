package org.lessons;

import org.junit.jupiter.api.Test;
import org.lessons.singleton.DatabaseSingletonEager;
import org.lessons.singleton.DatabaseSingletonLazy;
import org.lessons.singleton.realcase.Database;
import org.lessons.singleton.realcase.DatasourceProperties;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Project: DesignPatternsLessons
 * Description: Testing Singletons
 *
 * @author axteel on 04.04.2021 : 01:58
 * @version 1.0
 */
public class DatabaseSingletonTest {
    @Test
    public void singletonEagerTest() {
        DatabaseSingletonEager singleton;
        DatabaseSingletonEager anotherSingleton;
        singleton = DatabaseSingletonEager.getInstance();
        anotherSingleton = DatabaseSingletonEager.getInstance();
        System.out.println(singleton);
        System.out.println(anotherSingleton);
        assertSame(singleton, anotherSingleton);
    }

    @Test
    public void singletonLazyTest() {
        DatabaseSingletonLazy singleton;
        DatabaseSingletonLazy anotherSingleton;
        singleton = DatabaseSingletonLazy.getInstance();
        anotherSingleton = DatabaseSingletonLazy.getInstance();

        assertSame(singleton, anotherSingleton);
    }

    @Test
    public void mysqlTest() {
        DatasourceProperties properties = new DatasourceProperties("database.properties");
        Database database = Database.getInstance();
        database.init(properties);
        String createDB = "CREATE DATABASE IF NOT EXISTS Demo2";
        database.execute(createDB);
    }

    @Test
    public void databaseAdminPropTest() throws IOException {
        String fileName = "database.properties";

        System.out.println("Resource: " + fileName);
        try (InputStream is = getFileFromResourceAsStream(fileName)) {
            Properties props = new Properties();
            props.load(is);

            assertEquals(props.getProperty("url"), "jdbc:mysql://localhost:3306");
            assertEquals(props.getProperty("username"), "admin");
            assertEquals(props.getProperty("password"), "Admin12345");
        }


    }

    private InputStream getFileFromResourceAsStream(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }
}
