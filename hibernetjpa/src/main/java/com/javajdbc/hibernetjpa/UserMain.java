package com.javajdbc.hibernetjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserMain {

	private static EntityManagerFactory entityManagerFactory =
	          Persistence.createEntityManagerFactory("example-unit");

	  public static void main(String[] args) {
	      try {
	          persistEntity();
	      } finally {
	          entityManagerFactory.close();
	      }
	  }

	  public static void persistEntity() {
		  System.out.println("-- persisting --");
	      user user = new user();
	      user.setName("Adam");
	      user.setPhone("111-111-1111");

	      EntityManager em = entityManagerFactory.createEntityManager();
	      em.getTransaction().begin();
	      em.persist(user);
	      em.getTransaction().commit();
	      em.close();
	  }

	  private static void loadEntity() {
	      System.out.println("-- loading --");
	      EntityManager em = entityManagerFactory.createEntityManager();
	      List<user> entityAList = em.createQuery("Select t from User t")
	                                 .getResultList();
	      entityAList.forEach(System.out::println);
	      em.close();
	  }
	
	  }
	}


