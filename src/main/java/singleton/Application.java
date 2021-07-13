package singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {
	private static Application instance = null;

	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("formation-jpa");

	
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}
		return instance;
	}

	
}

