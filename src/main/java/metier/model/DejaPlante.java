package metier.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DejaPlante {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long age;
	@ManyToOne
	@JoinColumn(name="jardin_id")
	private Jardin jardin;
	@ManyToOne
	@JoinColumn(name="vegetal_id")
	private Vegetal vegetal;
	
	public DejaPlante() {
		super();
	}

	public DejaPlante(Long id, Long age, Jardin jardin, Vegetal vegetal) {
		super();
		this.id = id;
		this.age = age;
		this.jardin = jardin;
		this.vegetal = vegetal;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public Jardin getJardin() {
		return jardin;
	}

	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}

	public Vegetal getVegetal() {
		return vegetal;
	}

	public void setVegetal(Vegetal vegetal) {
		this.vegetal = vegetal;
	}

}
