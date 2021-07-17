package testes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ApplicationConfig;
import metier.model.Admin;
import metier.model.Adresse;
import metier.repository.IAdminRepository;
import metier.repository.IAdresseRepository;

public class testJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		IAdminRepository adminRepo = context.getBean(IAdminRepository.class);
		IAdresseRepository adresseRepo = context.getBean(IAdresseRepository.class);
		Admin admin = new Admin("giletJaune", "jojo", "jojo.giletJaune@gmail.com", "12345", "jojo");

		admin = adminRepo.save(admin);
		Adresse adresse = new Adresse(38L, "allée de Brignon", 33140L, "Villenave d'Ornon");

		adresse = adresseRepo.save(adresse);

		context.close();

	}

}
