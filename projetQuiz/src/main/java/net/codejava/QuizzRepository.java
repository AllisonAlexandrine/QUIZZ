package net.codejava;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class QuizzRepository {
	@Autowired
	private EntityManager entityManager;
	
	@Transactional 
	public void select(Quizz quiz) {
		
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
