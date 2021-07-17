package metier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class GuideUtilisation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private FormatSauvegarde formatSauvegarde;
	@OneToOne
	@JoinColumn(name="meteo_id")
	private Meteo meteo;
	@OneToOne(mappedBy="guideUtilisation")
	private Facture facture;
	
	public GuideUtilisation() {
		super();
	}
	public GuideUtilisation(Long id, FormatSauvegarde formatSauvegarde, Meteo meteo, Facture facture) {
		super();
		this.id = id;
		this.formatSauvegarde = formatSauvegarde;
		this.meteo = meteo;
		this.facture = facture;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public FormatSauvegarde getFormatSauvegarde() {
		return formatSauvegarde;
	}
	public void setFormatSauvegarde(FormatSauvegarde formatSauvegarde) {
		this.formatSauvegarde = formatSauvegarde;
	}
	public Meteo getMeteo() {
		return meteo;
	}
	public void setMeteo(Meteo meteo) {
		this.meteo = meteo;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
}
