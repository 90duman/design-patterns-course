package org.lessons.singleton.realcase;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * DatasourceProperties.class is used to encapsulate
 * necessary info to connect to MySQL database
 * <p>
 *
 * @author axteel on 04.04.2021 : 03:59
 * @version 1.0
 */
public class DatasourceProperties {
    private String url;
    private String username;
    private String password;

    public DatasourceProperties() { }

    public DatasourceProperties(String filename) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);

        if (inputStream == null) {
            throw new IllegalArgumentException("File not found! " + filename);
        }

        try {
            Properties props = new Properties();
            props.load(inputStream);

            this.url = props.getProperty("url");
            this.username = props.getProperty("username");
            this.password = props.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DatasourceProperties{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
