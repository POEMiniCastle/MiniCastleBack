package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Card")
@NoArgsConstructor
@Getter
@Setter

public class Card {
    @Id
    @Column(name="card_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int card_id;
    @Column
    private String card_name;
    @Column
    private String card_type;
    @Column
    private String description;
    @Column
    private String score_value;
    @Column
    private String card_image_path;

}
