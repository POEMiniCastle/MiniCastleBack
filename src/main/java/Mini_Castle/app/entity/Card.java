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
    
}
