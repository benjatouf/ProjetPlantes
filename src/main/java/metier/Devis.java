package metier;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Devis {
	@Id
	private Long id;
	private Long montant;
	private Article article;
	private Statut statut;
	@ManyToOne
	@JoinColumn(name="devis_id")
	private Utilisateur utilisateur;
}
