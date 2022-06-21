package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Policies;

@Repository
public class PoliciesDAOImpl implements PoliciesDAO {

	@Autowired
    private EntityManager entityManager;
	
	 @Override
	    public List<Policies> findAll() {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Query<Policies> theQuery = currentSession.createQuery("from Policies", Policies.class);
	        List<Policies> polcies = theQuery.getResultList();

	        return polcies;

	    }

	@Override
	public Policies findPolicy(String idPolicy) {
		 Session currentSession = entityManager.unwrap(Session.class);
	        Query<Policies> theQuery = currentSession.createQuery("from Policies where idpolicy=:id", Policies.class);
	        theQuery.setParameter("id", idPolicy);
	        Policies poliza = theQuery.getSingleResult();
	        return poliza;
	}
	
	
}
