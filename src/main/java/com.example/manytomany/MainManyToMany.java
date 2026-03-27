package com.example.manytomany;

import jakarta.persistence.*;
import java.util.Arrays;

public class MainManyToMany {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("examplePU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Student s1 = new Student();
        s1.setName("David");

        Student s2 = new Student();
        s2.setName("Budi");

        Course c1 = new Course();
        c1.setTitle("Java");

        Course c2 = new Course();
        c2.setTitle("Database");

        s1.setCourses(Arrays.asList(c1, c2));
        s2.setCourses(Arrays.asList(c1));

        em.persist(c1);
        em.persist(c2);
        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}