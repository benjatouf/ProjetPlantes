package metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Vegetal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
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
	private Long consommationEau;
	private Long consommationEngrais;
	private Long prix;
	private Long prixFruit;
	private List<Vegetal> affinite;
	private DejaPlante dejaPlante;
	private Commentaire commentaire;
	private Article article;
	private Notice notice;
	
	public Vegetal(Nature nature, TempsDeVie tempsDeVie, Presentation presentation, Sol sol, Comportement comportement,
			Utilite utilite, TypeDeFeuille typeDeFeuille, TempsDeFeuille tempsDeFeuille,
			UtiliteOrnement utiliteOrnement, UtiliteGastronomie utiliteGastronomie, Couleur couleur,
			UtiliteComposition utiliteComposition, UtiliteCimetiere utiliteCimetiere, Long consommationEau,
			Long consommationEngrais, Long prix, Long prixFruit, List<Vegetal> affinite, DejaPlante dejaPlante,
			Commentaire commentaire, Article article, Notice notice) {
		super();
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
		this.consommationEau = consommationEau;
		this.consommationEngrais = consommationEngrais;
		this.prix = prix;
		this.prixFruit = prixFruit;
		this.affinite = affinite;
		this.dejaPlante = dejaPlante;
		this.commentaire = commentaire;
		this.article = article;
		this.notice = notice;
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
	public Long getConsommationEau() {
		return consommationEau;
	}
	public void setConsommationEau(Long consommationEau) {
		this.consommationEau = consommationEau;
	}
	public Long getConsommationEngrais() {
		return consommationEngrais;
	}
	public void setConsommationEngrais(Long consommationEngrais) {
		this.consommationEngrais = consommationEngrais;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	public Long getPrixFruit() {
		return prixFruit;
	}
	public void setPrixFruit(Long prixFruit) {
		this.prixFruit = prixFruit;
	}
	public List<Vegetal> getAffinite() {
		return affinite;
	}
	public void setAffinite(List<Vegetal> affinite) {
		this.affinite = affinite;
	}
	public DejaPlante getDejaPlante() {
		return dejaPlante;
	}
	public void setDejaPlante(DejaPlante dejaPlante) {
		this.dejaPlante = dejaPlante;
	}
	public Commentaire getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	
}
