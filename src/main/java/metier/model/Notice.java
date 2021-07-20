package metier.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Notice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Temps temps;
	private Engrais engrais;
	@OneToMany(mappedBy="notice")
	private List<Vegetal> vegetal;
	
	public Notice() {
		super();
	}
	public Notice(Long id, Temps temps, Engrais engrais) {
		super();
		this.id = id;
		this.temps = temps;
		this.engrais = engrais;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Temps getTemps() {
		return temps;
	}
	public void setTemps(Temps temps) {
		this.temps = temps;
	}
	public Engrais getEngrais() {
		return engrais;
	}
	public void setEngrais(Engrais engrais) {
		this.engrais = engrais;
	}
	
}
