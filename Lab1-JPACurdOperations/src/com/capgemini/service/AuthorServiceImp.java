package com.capgemini.service;

import com.capgemini.dao.AuthorDao;
import com.capgemini.dao.AuthorDaoImp;
import com.capgemini.entities.Author;



public class AuthorServiceImp implements AuthorService {
	 
	private AuthorDao dao;
	public AuthorServiceImp()
	{
		dao=new AuthorDaoImp();
	}
	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();  
		dao.addAuthor(author);
		dao.commitTransaction();
		
	}
	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
	}
	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
		
	}
	@Override
	public Author findAuthorById(int id) {
		//no need of transaction, as it's an read operation
				Author author  = dao.getAuthorById(id);
				return author;
	}
}
