package com.cg.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpacrud.entities.Book;

public class BookDaoImpl implements BookDao  {

	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	

	

	

	//Lab2.2 find all books(query 1)
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	//Lab2.2 find all books written by the given author name(query 2)
		@Override
		public List<Book> getAuthorBooks(String author) {
			String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";
			TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
			query.setParameter("pAuthor", author);
			List<Book> bookList = query.getResultList();
			return bookList;
		}
		
		
	//Lab2.2 find all books within in a price range(query 3)
	@Override
	public List<Book> getBooksInPriceRange(double low,double high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	
   //Lab2.2 find book by given id(query 4)
	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
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
