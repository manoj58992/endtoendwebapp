package com.endtoendwebapp.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.endtoendwebapp.entities.TeamsEntity;
@Repository
@Transactional
public class TeamsRepository {

	private EntityManager em;

	
	public void save(TeamsEntity teams) {
		em.persist(teams);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;

	}
}