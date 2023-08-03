package Mini_Castle.app.Dto;

import Mini_Castle.app.entity.Card;

public class CardDto {
	
	private Integer id;
	private Integer localID;
	private String card_name;
	private String card_type;
	private String description;
	private Integer score_value;
	private String card_image_path;
	
	public CardDto() { }
	
	public CardDto(Integer id, String card_name, String card_type, String description, Integer score_value,
			String card_image_path) {
		this.id = id;
		this.card_name = card_name;
		this.card_type = card_type;
		this.description = description;
		this.score_value = score_value;
		this.card_image_path = card_image_path;
	}

	public CardDto(Card card) {
		this.id = card.getId();
		this.card_name = card.getCard_name();
		this.card_type = card.getCard_type();
		this.description = card.getDescription();
		this.score_value = card.getScore_value();
		this.card_image_path = card.getCard_image_path();
	}
	
	public CardDto(CardDto card, Integer localID) {
		this.id = card.getId();
		this.localID = localID;
		this.card_name = card.getCard_name();
		this.card_type = card.getCard_type();
		this.description = card.getDescription();
		this.score_value = card.getScore_value();
		this.card_image_path = card.getCard_image_path();
	}
	public Integer getLocalID() {
		return localID;
	}

	public void setLocalID(Integer localID) {
		this.localID = localID;
	}

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

	@Override
	public String toString() {
		return "CardDto [id=" + id + ", localID=" + localID + ", card_name=" + card_name + ", card_type=" + card_type
				+ ", description=" + description + ", score_value=" + score_value + ", card_image_path="
				+ card_image_path + "]";
	}
	
	
}
