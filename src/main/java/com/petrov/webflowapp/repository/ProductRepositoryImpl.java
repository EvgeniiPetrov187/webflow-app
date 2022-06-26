//package com.petrov.webflowapp.repository;
//
//import com.petrov.webflowapp.Config;
//import com.petrov.webflowapp.persist.Product;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManagerFactory;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Consumer;
//import java.util.function.Function;
//
//@Component
//@Repository
//public class ProductRepositoryImpl implements ProductRepository {
//
//    private Session session;
//
//    private Transaction transaction;
//
////    @Autowired
////    private final EntityManagerFactory entityManagerFactory;
////
////    public ProductRepositoryImpl(EntityManagerFactory entityManagerFactory) {
////        this.entityManagerFactory = entityManagerFactory;
////    }
//
//   @Autowired
//    private Config config = new Config();
//
//    public ProductRepositoryImpl(Config config) {
//        this.config = config;
//    }
//
//    public Session openSessionWithTransaction() {
//        session = сonfig.getSessionFactory().openSession();
//        transaction = session.beginTransaction();
//        return session;
//    }
//
//    public void closeSessionWithTransaction() {
//        transaction.commit();
//        session.close();
//    }
//
//    @Override
//    public List findAll() {
//        return executeSessionFunction(session1 -> session1.createQuery("select p from Product p").list());
//    }
//
//
//    @Override
//    public Optional<Product> findById(Long id) {
//        return executeSessionFunction(session -> Optional.ofNullable(session.get(Product.class, id)));
//    }
//
//    @Override
//    public void saveOrUpdate(Product product) {
//        executeSessionConsumer(session -> session.saveOrUpdate(product));
//    }
//
//    @Override
//    public void delete(Product product) {
//        executeSessionConsumer(session -> session.delete(product));
//    }
//
//    private <T> T executeSessionFunction(Function<Session, T> function) {
//        try {
//            return function.apply(openSessionWithTransaction());
//        } finally {
//            closeSessionWithTransaction();
//        }
//    }
//
//    private <T> void executeSessionConsumer(Consumer<Session> consumer) {
//        try {
//            consumer.accept(openSessionWithTransaction());
//        } finally {
//            closeSessionWithTransaction();
//        }
//    }
//
//    public void setConfig(Config config) {
//        this.config = config;
//    }
//
////    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
////        this.entityManagerFactory = entityManagerFactory;
////    }
//}
