package com.streamingsuperchatapp.collector.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class BatchDataSourceConfig {
    @Autowired
    private Environment env;

    @Bean
    public DataSource dynamodbDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.dynamodb-datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.dynamodb-datasource.url"));
        dataSource.setUsername(env.getProperty("spring.dynamodb-datasource.username"));
        dataSource.setPassword(env.getProperty("spring.dynamodb-datasource.password"));
        return dataSource;
    }
}
