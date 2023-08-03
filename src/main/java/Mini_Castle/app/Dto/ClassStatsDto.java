package Mini_Castle.app.Dto;

public class ClassStatsDto {

    private Integer id;
    private String name;
    private Integer base_hp;
    private Integer base_armor;
    private Integer base_damage;
    private String skill_name;
    private String skill_description;
    private String imagePath;

    public ClassStatsDto(){}

    public ClassStatsDto(Integer id, String name, Integer base_hp, Integer base_armor, Integer base_damage,
            String skill_name, String skill_description, String imagePath) {
        this.id = id;
        this.name = name;
        this.base_hp = base_hp;
        this.base_armor = base_armor;
        this.base_damage = base_damage;
        this.skill_name = skill_name;
        this.skill_description = skill_description;
        this.imagePath = imagePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBase_hp() {
        return base_hp;
    }

    public void setBase_hp(Integer base_hp) {
        this.base_hp = base_hp;
    }

    public Integer getBase_armor() {
        return base_armor;
    }

    public void setBase_armor(Integer base_armor) {
        this.base_armor = base_armor;
    }

    public Integer getBase_damage() {
        return base_damage;
    }

    public void setBase_damage(Integer base_damage) {
        this.base_damage = base_damage;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_description() {
        return skill_description;
    }

    public void setSkill_description(String skill_description) {
        this.skill_description = skill_description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    
}
