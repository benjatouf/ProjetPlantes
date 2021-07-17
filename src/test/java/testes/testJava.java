package testes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ApplicationConfig;
import metier.model.Admin;
import metier.repository.IAdminRepository;

public class testJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		IAdminRepository adminRepo = context.getBean(IAdminRepository.class);

		Admin admin = new Admin("giletJaune", "jojo", "jojo.giletJaune@gmail.com", "12345", "jojo");

		admin = adminRepo.save(admin);

		context.close();

	}

}
