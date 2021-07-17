package metier.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Personne {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, String adresseMail, String motDePasse, String pseudo) {
		super(nom, prenom, adresseMail, motDePasse, pseudo);
		// TODO Auto-generated constructor stub
	}

}
