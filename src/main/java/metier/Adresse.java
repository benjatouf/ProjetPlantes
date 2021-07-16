package metier;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Adresse {
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name="adresse_id")
	private Utilisateur utilisateur;
	private Long numero;
	private String rue;
	private Long codePostal;
	private String ville;
	
	public Adresse() {
		super();
	}
	

	public Adresse(Long id, Utilisateur utilisateur, Long numero, String rue, Long codePostal, String ville) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public Long getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
