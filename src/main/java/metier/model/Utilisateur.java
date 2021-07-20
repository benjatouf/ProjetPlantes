package metier.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("utilisateur")
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
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(String numeroTelephone, List<Adresse> adresse, List<Jardin> jardin, List<Devis> devis,
			List<Recherche> recherche, List<Commentaire> commentaire) {
		super();
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
		this.jardin = jardin;
		this.devis = devis;
		this.recherche = recherche;
		this.commentaire = commentaire;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public List<Adresse> getAdresse() {
		return adresse;
	}
	public void setAdresse(List<Adresse> adresse) {
		this.adresse = adresse;
	}
	public List<Jardin> getJardin() {
		return jardin;
	}
	public void setJardin(List<Jardin> jardin) {
		this.jardin = jardin;
	}
	public List<Devis> getDevis() {
		return devis;
	}
	public void setDevis(List<Devis> devis) {
		this.devis = devis;
	}
	public List<Recherche> getRecherche() {
		return recherche;
	}
	public void setRecherche(List<Recherche> recherche) {
		this.recherche = recherche;
	}
	public List<Commentaire> getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(List<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}
	
}
