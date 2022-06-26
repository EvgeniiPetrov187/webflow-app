//package com.petrov.webflowapp.repository;
//
//
//import com.petrov.webflowapp.Config;
//import com.petrov.webflowapp.ServiceFactory;
//import com.petrov.webflowapp.persist.Category;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import javax.persistence.EntityManagerFactory;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Consumer;
//import java.util.function.Function;
//
//@Component("")
//@Repository
//public class CategoryRepositoryImpl implements CategoryRepository {
//
//    private Session session;
//
//    private Transaction transaction;
//
////    @Autowired
////    private EntityManagerFactory entityManagerFactory;
////
////    public CategoryRepositoryImpl(EntityManagerFactory emf) {
////        this.entityManagerFactory = emf;
////    }
//
//    @Autowired
//    private Config config;
//
//    public CategoryRepositoryImpl(Config config) {
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
//        return executeSessionFunction(session1 -> session1.createQuery("select c from Category c").list());
//    }
//
//
//    @Override
//    public Optional<Category> findById(Long id) {
//        return executeSessionFunction(session -> Optional.ofNullable(session.get(Category.class, id)));
//    }
//
//    @Override
//    public void saveOrUpdate(Category category) {
//        executeSessionConsumer(session -> session.saveOrUpdate(category));
//    }
//
//    @Override
//    public void delete(Category category) {
//        executeSessionConsumer(session -> session.delete(category));
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
////    public void setEntityManagerFactory(ServiceFactory entityManagerFactory) {
////        this.entityManagerFactory = entityManagerFactory;
////    }
//
//    public void setConfig(Config config) {
//        this.config = config;
//    }
//
////    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
////       this.entityManagerFactory = entityManagerFactory;
////    }
//}
