package AnnonationClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {
	/*@Bean(name="World",
			initMethod="init",destroyMethod="destroy"
			)
	@Scope("prototype")*/
	@Bean(name="World")
	public HelloWorld helloworld()
	{
		HelloWorld hello= new HelloWorld();
		hello.setMessage("Annotation Class");
		return hello;
	}
	/*@Bean(name="World1",
			initMethod="init",destroyMethod="destroy"
			)
	@Scope("prototype")*/
	@Bean(name="World1")
	public HelloWorld helloword1()
	{
		HelloWorld hello= new HelloWorld();
		return hello;
	}
	@Bean(name="War")
	public WorldWar worldWar()
	{
		
		return new WorldWar();
	}

}
//at the same time the destroy is not called when we declare scope prototype.
