package miniCastle.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "current_card_Dto")

public class CurrentCard {
	@Id
	@Column(name = "player_id")
	private Integer playerId;

	@Column(name = "card_type", length = 250)
	private String cardType;

	@Column(name = "player_position")
	private Integer playerPosition;

	@Column(name = "monster_damage")
	private Integer monsterDamage;

	@Column(name = "monster_hp")
	private Integer monsterHp;

	@Column(name = "xp_reward")
	private Integer xpReward;

	@Column(name = "trap_skill_check")
	private Integer trapSkillCheck;

	@Column(name = "loot_id")
	private Integer lootId;

	@Column(name = "shop_item_price")
	private Integer shopItemPrice;

	@Column(name = "shop_item_quantity")
	private Integer shopItemQuantity;

	public CurrentCard() {

	}

	public CurrentCard(Integer playerId, String cardType, Integer playerPosition, Integer monsterDamage,
			Integer monsterHp, Integer xpReward, Integer trapSkillCheck, Integer lootId, Integer shopItemPrice,
			Integer shopItemQuantity) {
		this.playerId = playerId;
		this.cardType = cardType;
		this.playerPosition = playerPosition;
		this.monsterDamage = monsterDamage;
		this.monsterHp = monsterHp;
		this.xpReward = xpReward;
		this.trapSkillCheck = trapSkillCheck;
		this.lootId = lootId;
		this.shopItemPrice = shopItemPrice;
		this.shopItemQuantity = shopItemQuantity;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Integer getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(Integer playerPosition) {
		this.playerPosition = playerPosition;
	}

	public Integer getMonsterDamage() {
		return monsterDamage;
	}

	public void setMonsterDamage(Integer monsterDamage) {
		this.monsterDamage = monsterDamage;
	}

	public Integer getMonsterHp() {
		return monsterHp;
	}

	public void setMonsterHp(Integer monsterHp) {
		this.monsterHp = monsterHp;
	}

	public Integer getXpReward() {
		return xpReward;
	}

	public void setXpReward(Integer xpReward) {
		this.xpReward = xpReward;
	}

	public Integer getTrapSkillCheck() {
		return trapSkillCheck;
	}

	public void setTrapSkillCheck(Integer trapSkillCheck) {
		this.trapSkillCheck = trapSkillCheck;
	}

	public Integer getLootId() {
		return lootId;
	}

	public void setLootId(Integer lootId) {
		this.lootId = lootId;
	}

	public Integer getShopItemPrice() {
		return shopItemPrice;
	}

	public void setShopItemPrice(Integer shopItemPrice) {
		this.shopItemPrice = shopItemPrice;
	}

	public Integer getShopItemQuantity() {
		return shopItemQuantity;
	}

	public void setShopItemQuantity(Integer shopItemQuantity) {
		this.shopItemQuantity = shopItemQuantity;
	}
}