package com.cg.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hello {
	
	private String message;
	private Set<String> s=new HashSet<String>();
	private List<String> l=new ArrayList<String>();
	private Map<Integer,String >m=new HashMap<Integer,String>();
	hello(Set<String> s,List<String >l,Map<Integer,String >m )
	{
		this.s=s;
		this.l=l;
		this.m=m;
		
	}
	
	public String getData()
	{
		return "hello class"+message;
	}

	   public void setMessage(String message){
	      this.message  = message;
	   }
	
	   public void getCollection()
	   {
		
		   for(String data:s)
		      {
		    	 System.out.println(data);
		      }
		      for(String data1:l)
		      {
		    	  System.out.println(data1);
		      }
		      for(Entry<Integer,String> e:m.entrySet())
		      {
		    	  System.out.println(e);
		      }
	   }
	  
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	    
	   }
}
