package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.JobNumber;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 10, 2021
 */
public class JobNumberHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ProductionSystem");
	
	public void insertNewJob(JobNumber newJob) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(newJob);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<JobNumber> jobsList(){
		EntityManager em = emfactory.createEntityManager();
		List<JobNumber> list = em.createQuery("SELECT job FROM JobNumber job").getResultList();
		return list;
		
	}

}
