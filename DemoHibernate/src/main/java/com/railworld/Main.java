package com.railworld;
import com.railworld.Model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.loader.ast.internal.EntityBatchLoaderArrayParam;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager em = emf.createEntityManager();

        User user = new User();
        user.setName("sandip jha");
        user.setEmail("sandip@gmail.com");
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        User foundUser = em.find(User.class, user.getId());
        System.out.println("User found: " + foundUser.getName()+" " +foundUser.getId());

        em.getTransaction().begin();
        foundUser.setName("swarup pawar");
        em.getTransaction().commit();
        System.out.println("Updated User Name: " + foundUser.getName());

        // Delete User
//        em.getTransaction().begin();
//        em.remove(foundUser);
//        em.getTransaction().commit();
//        System.out.println("User deleted.");

        em.close();
        emf.close();
    }
}