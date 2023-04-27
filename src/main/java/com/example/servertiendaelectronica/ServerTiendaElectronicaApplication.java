package com.example.servertiendaelectronica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ServletComponentScan
@EnableMongoRepositories(basePackages = {"com.example.servertiendaelectronica.Repositories"})
@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class ServerTiendaElectronicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerTiendaElectronicaApplication.class, args);
    }

}
