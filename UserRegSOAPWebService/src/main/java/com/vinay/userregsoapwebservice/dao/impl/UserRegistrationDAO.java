package com.vinay.userregsoapwebservice.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vinay.userregsoapwebservice.dao.IUserRegistrationDAO;
import com.vinay.userregsoapwebservice.model.UserDetails;
import com.vinay.userregsoapwebservice.utils.DBUtils;

public class UserRegistrationDAO implements IUserRegistrationDAO {

	UserDetails userDetails = new UserDetails();

	private EntityManager entityManager;
	private Query query;

	@Override
	public boolean createUser(UserDetails userDetails) {
		try {

			entityManager = DBUtils.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();

			entityManager.persist(userDetails);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (entityManager != null) {
				entityManager.close();

			}

		}

		return true;
	}

	@Override
	public UserDetails getUser(String email) {
		try {
			entityManager = DBUtils.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();

			/*
			 * query = entityManager.createQuery("from User where email= :email"); query =
			 * entityManager. query.setParameter("email", email);
			 */

			/* userDetails = (UserDetails) query.getSingleResult(); */
			userDetails=entityManager.find(UserDetails.class,email);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return userDetails;
	}

}
