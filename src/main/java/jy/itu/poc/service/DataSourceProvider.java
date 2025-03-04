package jy.itu.poc.service;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataSourceProvider {
    private DataSourceProvider() {
    }

    public static DataSource getDataSource() {
        Properties props = new Properties();

        try (InputStream input = DataSourceProvider.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            if (input == null) {
                return null;
            }

            props.load(input);
        } catch (IOException ex) {
            return null;
        }

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(props.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(props.getProperty("spring.datasource.url"));
        dataSource.setUsername(props.getProperty("spring.datasource.username"));
        dataSource.setPassword(props.getProperty("spring.datasource.password"));

        return dataSource;
    }
}
