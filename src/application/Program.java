package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
//		Person p1 = new Person(null, "Person1", "person1@gmail.com");
//		Person p2 = new Person(null, "Person2", "person2@gmail.com");
//		Person p3 = new Person(null, "Person3", "person13gmail.com");
//	
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
	
//		Person p = em.find(Person.class, 2);
//		System.out.println(p);

		Person p = em.find(Person.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("Done!");
	}

}
