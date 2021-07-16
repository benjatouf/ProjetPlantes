package metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur extends Personne {
	private String numeroTelephone;
	@OneToMany(mappedBy="utilisateur")
	private List<Adresse> adresse;
	@OneToMany(mappedBy="utilisateur")
	private List<Jardin> jardin;
	@OneToMany(mappedBy="utilisateur")
	private List<Devis> devis;
	@OneToMany(mappedBy="utilisateur")
	private List<Recherche> recherche;
	@OneToMany(mappedBy="utilisateur")
	private List<Commentaire> commentaire;
	
	
}
