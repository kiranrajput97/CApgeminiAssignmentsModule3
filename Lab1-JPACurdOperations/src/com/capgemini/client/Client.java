package com.capgemini.client;

import com.capgemini.entities.Author;
import com.capgemini.service.AuthorService;
import com.capgemini.service.AuthorServiceImp;

public class Client {
	public static void main(String ar[])
	{
		AuthorService auths=new AuthorServiceImp();
		
		Author auth=new Author();
		auth.setAuthorId(1);
		auth.setAuthorFirstName("Rohit");
		auth.setAuthorLastName("Kumar");
		auth.setAuthorPhoneNumber("1234567890");
		auths.addAuthor(auth);
		
		Author auth2=new Author();
		auth2.setAuthorId(2);
		auth2.setAuthorFirstName("Rohit");
		auth2.setAuthorLastName("Sinha");
		auth2.setAuthorPhoneNumber("1234561230");
		auths.addAuthor(auth);
		
		System.out.println(auths.findAuthorById(1));
		auth.setAuthorPhoneNumber("678954327878");
		auths.updateAuthor(auth);
		
		
		System.out.println(auths.findAuthorById(1));
		auths.removeAuthor(auth2);
		
	}

}
