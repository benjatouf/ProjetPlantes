package metier.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Recette {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
//	private List<String> ingredientsNonVegetaux;
	@OneToMany(mappedBy="recette")
	private List<RecetteJardin> recetteJardin;
	private String  methode;
	
	public Recette() {
		super();
	}
	public Recette(Long id, String nom, List<String> ingredientsNonVegetaux, List<RecetteJardin> recetteJardin,
			String methode) {
		super();
		this.id = id;
		this.nom = nom;
//		this.ingredientsNonVegetaux = ingredientsNonVegetaux;
		this.recetteJardin = recetteJardin;
		this.methode = methode;
	}
	public List<RecetteJardin> getRecetteJardin() {
		return recetteJardin;
	}
	public void setRecetteJardin(List<RecetteJardin> recetteJardin) {
		this.recetteJardin = recetteJardin;
	}
	public String getMethode() {
		return methode;
	}
	public void setMethode(String methode) {
		this.methode = methode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
//	public List<String> getIngredientsNonVegetaux() {
//		return ingredientsNonVegetaux;
//	}
//	public void setIngredientsNonVegetaux(List<String> ingredientsNonVegetaux) {
//		this.ingredientsNonVegetaux = ingredientsNonVegetaux;
//	}
}
