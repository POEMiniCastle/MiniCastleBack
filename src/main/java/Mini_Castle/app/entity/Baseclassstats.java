package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BaseClassStats")
@NoArgsConstructor
@Getter
@Setter

public class BaseClassStats {

    @Id
    @Column(name="class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="base_hp")
    private Integer base_hp;

    @Column(name="base_armor")
    private Integer base_armor;

    @Column(name="base_damage")
    private Integer base_damage;

    @Column(name="skill_name")
    private String skill_name;

    @Column(name="skill_description")
    private String skill_description;

    @Column(name="image_path")
    private String imagePath;

    @OneToOne(mappedBy = "classStats")
	private Character character;
}
