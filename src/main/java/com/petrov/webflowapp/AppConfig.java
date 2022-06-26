//package com.petrov.webflowapp;
//
//import com.petrov.webflowapp.repository.CategoryRepositoryImpl;
//import com.petrov.webflowapp.repository.ProductRepositoryImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//
//import javax.persistence.EntityManagerFactory;
//
//@Configuration
//@ComponentScan("com.petrov")
//public class AppConfig {
//
//    @Bean // бин для EntityManagerFactory
//    public EntityManagerFactory serviceFactory(){ return new ServiceFactory().getEntityManagerFactory(); }
//
//    @Bean
//    public ProductRepositoryImpl productRepositoryImpl(EntityManagerFactory emf) {
//        return new ProductRepositoryImpl(emf);
//    }
//
//    @Bean
//    public CategoryRepositoryImpl categoryRepositoryImpl(EntityManagerFactory emf) {
//        return new CategoryRepositoryImpl(emf);
//    }
//}