package metier.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Jardin {
	@Id
	private Long id;
	@OneToMany(mappedBy="jardin")
	private List<DejaPlante> dejaPlante;
	private Sol sol;
	private Exposition exposition;
	private String superficie;
	@ManyToOne
	@JoinColumn(name="jardin_id")
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="jardin")
	private List<RecetteJardin> recetteJardin;
	
	public Jardin() {
		super();
	}
	public Jardin(Long id, List<DejaPlante> dejaPlante, Sol sol, Exposition exposition, String superficie) {
		super();
		this.id = id;
		this.dejaPlante = dejaPlante;
		this.sol = sol;
		this.exposition = exposition;
		this.superficie = superficie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<DejaPlante> getDejaPlante() {
		return dejaPlante;
	}
	public void setDejaPlante(List<DejaPlante> dejaPlante) {
		this.dejaPlante = dejaPlante;
	}
	public Sol getSol() {
		return sol;
	}
	public void setSol(Sol sol) {
		this.sol = sol;
	}
	public Exposition getExposition() {
		return exposition;
	}
	public void setExposition(Exposition exposition) {
		this.exposition = exposition;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	
}
