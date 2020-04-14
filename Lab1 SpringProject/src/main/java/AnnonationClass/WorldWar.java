package AnnonationClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WorldWar {
	@Autowired
	@Qualifier("World1")
	HelloWorld World;
	public HelloWorld getWorld() {
		return World;
	}
	public void setWorld(HelloWorld world) {
		World = world;
	}
	WorldWar()
	{
	
		System.out.println("World War Start");
		
	}

	public void display() {
		
		World.display();
		System.out.println("World War End");
		
	}

}
