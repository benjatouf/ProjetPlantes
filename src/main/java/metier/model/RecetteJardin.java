package metier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RecetteJardin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="recetteJardinRecette_id")
	private Recette recette;
	@ManyToOne
	@JoinColumn(name="JardiRecetteJardin_id")
	private Jardin jardin;
}
