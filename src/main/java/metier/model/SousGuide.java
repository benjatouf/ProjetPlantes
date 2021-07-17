package metier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SousGuide {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="notice_id")
	private Notice notice;
	@ManyToOne
	@JoinColumn(name="guideUtilisation_id")
	private GuideUtilisation guideUtilisation;
}
