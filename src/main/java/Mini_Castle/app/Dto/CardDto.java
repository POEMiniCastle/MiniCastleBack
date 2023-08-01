package Mini_Castle.app.Dto;

public class CardDto {
	
	private Integer id;
	private String card_name;
	private String card_type;
	private String description;
	private Integer score_value;
	private String card_image_path;
	
	
	public CardDto(Integer id, String card_name, String card_type, String description, Integer score_value,
			String card_image_path) {
		this.id = id;
		this.card_name = card_name;
		this.card_type = card_type;
		this.description = description;
		this.score_value = score_value;
		this.card_image_path = card_image_path;
	}
	
	public CardDto() { }

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
	
}
