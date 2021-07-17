package metier.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Devis {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long montant;
	@OneToMany(mappedBy="devis")
	private List<Article> article;
	private Statut statut;
	@ManyToOne
	@JoinColumn(name="devis_id")
	private Utilisateur utilisateur;
	@OneToOne
	@JoinColumn(name="devisComande_id")
	private Commande commande;
	
}
