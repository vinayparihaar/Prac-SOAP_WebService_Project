package com.vinay.userregsoapwebservice.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtils {
	private static final EntityManagerFactory entityManagerFactory = getEntityManagerFactory();

	public static EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) {
			return Persistence.createEntityManagerFactory("UsersDetailsDB");
		}
		return entityManagerFactory;

	}

}
