package testes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.model.Admin;
import metier.model.Adresse;
import metier.repository.IAdminRepository;
import metier.repository.IAdresseRepository;

public class testJava {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		IAdminRepository adminRepo = context.getBean(IAdminRepository.class);
		IAdresseRepository adresseRepo = context.getBean(IAdresseRepository.class);
		Admin admin = new Admin("giletJaune", "jojo", "jojo.giletJaune@gmail.com", "12345", "jojo");

		Adresse adresse = new Adresse(38L, "allée de Brignon", 33140L, "Villenave d'Ornon");
		
		adresse = adresseRepo.save(adresse);
		admin = adminRepo.save(admin);
		
		context.close();

	}

}
