package dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import model.Customer;
import util.CustomerUtil;

public class CustomerDaoImpl implements CustomerDAO {
	private Session session;
	private EntityManager entityManager;
	
	{
		session=CustomerUtil.getMySessionFactory().openSession();
		session.getTransaction().begin();
		entityManager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

}
