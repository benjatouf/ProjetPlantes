package metier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long montant;
	@OneToOne(mappedBy="facture")
	private Commande commande;
	@OneToOne
	@JoinColumn(name="factureGuideUtilisation")
	private GuideUtilisation guideUtilisation;
	
	public Facture() {
		super();
	}

	public Facture(Long id, Long montant, Commande commande, GuideUtilisation guideUtilisation) {
		super();
		this.id = id;
		this.montant = montant;
		this.commande = commande;
		this.guideUtilisation = guideUtilisation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMontant() {
		return montant;
	}

	public void setMontant(Long montant) {
		this.montant = montant;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public GuideUtilisation getGuideUtilisation() {
		return guideUtilisation;
	}

	public void setGuideUtilisation(GuideUtilisation guideUtilisation) {
		this.guideUtilisation = guideUtilisation;
	}
	
	
}
