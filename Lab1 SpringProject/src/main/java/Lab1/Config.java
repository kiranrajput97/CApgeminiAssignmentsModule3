package Lab1;

import org.springframework.context.annotation.Bean;

import AnnonationClass.HelloWorld;

public class Config {
	@Bean(name="employee")
	public Employee employee()
	{
		Employee emp= new Employee();
		return emp;
	}
	@Bean(name="sub")
	public SUB sub()
	{
		return new SUB();
	}
}
