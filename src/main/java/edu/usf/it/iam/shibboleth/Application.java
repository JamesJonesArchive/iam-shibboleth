/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usf.it.iam.shibboleth;

import java.util.Arrays;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
//import org.springframework.beans.factory.config.YamlMapFactoryBean;
//import org.springframework.context.EnvironmentAware;
//import org.springframework.core.env.Environment;
//import org.springframework.core.env.MapPropertySource;
//import org.springframework.core.env.PropertiesPropertySource;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.Resource;

//import edu.usf.it.enrole.storage.StorageProperties;
//import edu.usf.it.enrole.token.TokenProperties;

// import edu.usf.it.enrole.storage.StorageService;

/**
 * Spring Boot Application class - Provides static method to start spring boot application
 * 
 * @author James Jones
 */
@SpringBootApplication
//@EnableConfigurationProperties({
//  SourceIdentifiersProperties.class
//})
@EnableTransactionManagement
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}