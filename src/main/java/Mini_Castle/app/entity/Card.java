package Mini_Castle.app.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "card")
@NoArgsConstructor
@Getter
@Setter

public class Card {

    @Id
    @Column(name="card_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="card_name")
    private String card_name;

    @Column(name="card_type")
    private String card_type;

    @Column(name="description")
    private String description;

    @Column(name="score_value")
    private Integer score_value;

    @Column(name="card_image_path")
    private String card_image_path;

    @ManyToMany
    @JoinTable(
        name="card_loot",
        joinColumns= @JoinColumn(name="card_id"), 
        inverseJoinColumns = @JoinColumn(name="loot_id"))
    private List<Loot> loots;
    
    public Card(Integer card_id, String card_name, String card_type, String description, Integer score_value,
            String card_image_path) {
        this.id = card_id;
        this.card_name = card_name;
        this.card_type = card_type;
        this.description = description;
        this.score_value = score_value;
        this.card_image_path = card_image_path;
    }

    public Card() {}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getScore_value() {
		return score_value;
	}

	public void setScore_value(Integer score_value) {
		this.score_value = score_value;
	}

	public String getCard_image_path() {
		return card_image_path;
	}

	public void setCard_image_path(String card_image_path) {
		this.card_image_path = card_image_path;
	}

	public List<Loot> getLoots() {
		return loots;
	}

	public void setLoots(List<Loot> loots) {
		this.loots = loots;
	}
    
}
