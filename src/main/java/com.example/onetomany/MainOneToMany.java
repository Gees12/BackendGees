package com.example.onetomany;

import jakarta.persistence.*;
import java.util.Arrays;

public class MainOneToMany {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("examplePU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Customer c = new Customer();
        c.setName("David");

        Order o1 = new Order();
        o1.setProduct("Laptop");
        o1.setCustomer(c);

        Order o2 = new Order();
        o2.setProduct("Mouse");
        o2.setCustomer(c);

        c.setOrders(Arrays.asList(o1, o2));

        em.persist(c);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}