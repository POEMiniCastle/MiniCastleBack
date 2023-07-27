package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Baseclassstats")
@NoArgsConstructor
@Getter
@Setter
public class Baseclassstats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int class_id;
    @Column
    private String name;
    @Column
    private String base_hp;
    @Column
    private String base_armor;
    @Column
    private String base_damage;
    @Column
    private String skill_name;
    @Column
    private String skill_description;
    @Column
    private String imagePath;
}
