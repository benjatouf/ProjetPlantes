package metier.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="devis_id")
	private Devis devis;
	@ManyToOne
	@JoinColumn(name="vegetal_id")
	private Vegetal vegetal;
	public Article() {
		super();
	}

	public Article(Long id, Devis devis, Vegetal vegetal) {
		super();
		this.id = id;
		this.devis = devis;
		this.vegetal = vegetal;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Devis getDevis() {
		return devis;
	}
	public void setDevis(Devis devis) {
		this.devis = devis;
	}
	public Vegetal getVegetal() {
		return vegetal;
	}
	public void setVegetal(Vegetal vegetal) {
		this.vegetal = vegetal;
	}

	
}
