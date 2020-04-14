package com.capgemini.dao;

import javax.persistence.EntityManager;

import com.capgemini.entities.Author;




public class AuthorDaoImp implements AuthorDao {
	
	private EntityManager entityManager;
	
	public AuthorDaoImp()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Author getAuthorById(int id) {
		Author author=entityManager.find(Author.class, id);
		return author;
	}

	@Override
	public void addAuthor(Author author) {
		entityManager.persist(author);
		
	}

	@Override
	public void removeAuthor(Author author) {
		entityManager.remove(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		entityManager.merge(author);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();
		
	}


}
