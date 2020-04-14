package AnnonationClass;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	private String Message;
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public HelloWorld()
	{
		System.out.println("HelloWorld Class");
		
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Programme Start");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Programme End");
	}
	public void display()
	{
		System.out.println("HelloWorld Method"+Message);
	}

}
