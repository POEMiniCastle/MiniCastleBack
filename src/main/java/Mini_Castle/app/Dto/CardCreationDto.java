package Mini_Castle.app.Dto;

public class CardCreationDto {

	private CardDto card;
	private MonsterDto monster;
	private TrapDto trap;
	
	public CardCreationDto() {}
	
	public CardCreationDto(CardDto card, MonsterDto monster){
		this.card = card;
		this.monster = monster;
	}
	
	public CardCreationDto(CardDto card, TrapDto trap) {
		this.card = card;
		this.trap = trap;
	}
	public CardDto getCard() {
		return card;
	}
	public void setCard(CardDto card) {
		this.card = card;
	}
	public MonsterDto getMonster() {
		return monster;
	}
	public void setMonster(MonsterDto monster) {
		this.monster = monster;
	}

	public TrapDto getTrap() {
		return trap;
	}

	public void setTrap(TrapDto trap) {
		this.trap = trap;
	}
}
