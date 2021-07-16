package metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recherche {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="recherche_id")
	private Utilisateur utilisateur;
	private Date date;
	private Nature nature;
	private TempsDeVie tempsDeVie;
	private Presentation presentation;
	private Sol sol;
	private Comportement comportement;
	private Utilite utilite;
	private TypeDeFeuille typeDeFeuille;
	private TempsDeFeuille tempsDeFeuille;
	private UtiliteOrnement utiliteOrnement;
	private UtiliteGastronomie utiliteGastronomie;
	private Couleur couleur;
	private UtiliteComposition utiliteComposition;
	private UtiliteCimetiere utiliteCimetiere;
	
	public Recherche() {
		super();
	}
	public Recherche(Long id, Utilisateur utilisateur, Date date, Nature nature, TempsDeVie tempsDeVie,
			Presentation presentation, Sol sol, Comportement comportement, Utilite utilite, TypeDeFeuille typeDeFeuille,
			TempsDeFeuille tempsDeFeuille, UtiliteOrnement utiliteOrnement, UtiliteGastronomie utiliteGastronomie,
			Couleur couleur, UtiliteComposition utiliteComposition, UtiliteCimetiere utiliteCimetiere) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.date = date;
		this.nature = nature;
		this.tempsDeVie = tempsDeVie;
		this.presentation = presentation;
		this.sol = sol;
		this.comportement = comportement;
		this.utilite = utilite;
		this.typeDeFeuille = typeDeFeuille;
		this.tempsDeFeuille = tempsDeFeuille;
		this.utiliteOrnement = utiliteOrnement;
		this.utiliteGastronomie = utiliteGastronomie;
		this.couleur = couleur;
		this.utiliteComposition = utiliteComposition;
		this.utiliteCimetiere = utiliteCimetiere;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Nature getNature() {
		return nature;
	}
	public void setNature(Nature nature) {
		this.nature = nature;
	}
	public TempsDeVie getTempsDeVie() {
		return tempsDeVie;
	}
	public void setTempsDeVie(TempsDeVie tempsDeVie) {
		this.tempsDeVie = tempsDeVie;
	}
	public Presentation getPresentation() {
		return presentation;
	}
	public void setPresentation(Presentation presentation) {
		this.presentation = presentation;
	}
	public Sol getSol() {
		return sol;
	}
	public void setSol(Sol sol) {
		this.sol = sol;
	}
	public Comportement getComportement() {
		return comportement;
	}
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	public Utilite getUtilite() {
		return utilite;
	}
	public void setUtilite(Utilite utilite) {
		this.utilite = utilite;
	}
	public TypeDeFeuille getTypeDeFeuille() {
		return typeDeFeuille;
	}
	public void setTypeDeFeuille(TypeDeFeuille typeDeFeuille) {
		this.typeDeFeuille = typeDeFeuille;
	}
	public TempsDeFeuille getTempsDeFeuille() {
		return tempsDeFeuille;
	}
	public void setTempsDeFeuille(TempsDeFeuille tempsDeFeuille) {
		this.tempsDeFeuille = tempsDeFeuille;
	}
	public UtiliteOrnement getUtiliteOrnement() {
		return utiliteOrnement;
	}
	public void setUtiliteOrnement(UtiliteOrnement utiliteOrnement) {
		this.utiliteOrnement = utiliteOrnement;
	}
	public UtiliteGastronomie getUtiliteGastronomie() {
		return utiliteGastronomie;
	}
	public void setUtiliteGastronomie(UtiliteGastronomie utiliteGastronomie) {
		this.utiliteGastronomie = utiliteGastronomie;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	public UtiliteComposition getUtiliteComposition() {
		return utiliteComposition;
	}
	public void setUtiliteComposition(UtiliteComposition utiliteComposition) {
		this.utiliteComposition = utiliteComposition;
	}
	public UtiliteCimetiere getUtiliteCimetiere() {
		return utiliteCimetiere;
	}
	public void setUtiliteCimetiere(UtiliteCimetiere utiliteCimetiere) {
		this.utiliteCimetiere = utiliteCimetiere;
	}
	
}
