package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-03-10 20:11:19
 */
@Data
@TableName("tb_card_type")
public class CardTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer cardTypeId;
	/**
	 * 
	 */
	private String cardTypeName;
	/**
	 * 
	 */
	private Double cardTypeDenomination;
	/**
	 * 
	 */
	private Integer cardTypeValidity;
	/**
	 * 
	 */
	private String cardTypeStatus;
	/**
	 * 
	 */
	private Date cardTypeCreatetime;
	/**
	 * 
	 */
	private Date cardTypeModifytime;

	@Override
	public String toString() {
		return "CardTypeEntity{" +
				"cardTypeId=" + cardTypeId +
				", cardTypeName='" + cardTypeName + '\'' +
				", cardTypeDenomination=" + cardTypeDenomination +
				", cardTypeValidity=" + cardTypeValidity +
				", cardTypeStatus='" + cardTypeStatus + '\'' +
				", cardTypeCreatetime=" + cardTypeCreatetime +
				", cardTypeModifytime=" + cardTypeModifytime +
				'}';
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getCardTypeId() {
		return cardTypeId;
	}

	public void setCardTypeId(Integer cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	public String getCardTypeName() {
		return cardTypeName;
	}

	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}

	public Double getCardTypeDenomination() {
		return cardTypeDenomination;
	}

	public void setCardTypeDenomination(Double cardTypeDenomination) {
		this.cardTypeDenomination = cardTypeDenomination;
	}

	public Integer getCardTypeValidity() {
		return cardTypeValidity;
	}

	public void setCardTypeValidity(Integer cardTypeValidity) {
		this.cardTypeValidity = cardTypeValidity;
	}

	public String getCardTypeStatus() {
		return cardTypeStatus;
	}

	public void setCardTypeStatus(String cardTypeStatus) {
		this.cardTypeStatus = cardTypeStatus;
	}

	public Date getCardTypeCreatetime() {
		return cardTypeCreatetime;
	}

	public void setCardTypeCreatetime(Date cardTypeCreatetime) {
		this.cardTypeCreatetime = cardTypeCreatetime;
	}

	public Date getCardTypeModifytime() {
		return cardTypeModifytime;
	}

	public void setCardTypeModifytime(Date cardTypeModifytime) {
		this.cardTypeModifytime = cardTypeModifytime;
	}
}
