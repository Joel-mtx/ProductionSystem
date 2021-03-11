package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ProjectManager;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 10, 2021
 */
public class ProjectManagerHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ProductionSystem");
	
	public void insertProjectManager(ProjectManager manager) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(manager);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<ProjectManager> managersList(){
		EntityManager em = emfactory.createEntityManager();
		List<ProjectManager> managers = em.createQuery("SELECT manager FROM ProjectManager manager").getResultList();
		return managers;
		
	}

}
