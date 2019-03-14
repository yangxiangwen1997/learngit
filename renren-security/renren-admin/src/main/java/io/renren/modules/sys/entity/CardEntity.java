package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("tb_card")
public class CardEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 充值卡唯一标识
	 */
	@TableId
	private String cardId;
	/**
	 * 充值卡号
	 */
	private String cardNumber;
	/**
	 * 充值卡订单号
	 */
	private String cardAgentId;
	/**
	 * 充值卡面额ID
	 */
	private Integer cardTypeId;
	/**
	 * 充值卡到期时间
	 */
	private Date cardDueDate;
	/**
	 * 卡状态
	 */
	private String cardStatus;
	/**
	 * 订单创建时间
	 */
	private Date cardOrderCreatetime;
	/**
	 * 订单修改时间
	 */
	private Date cardOrderModifytime;
	/**
	 * 卡创建时间
	 */
	private Date cardCreatecardTime;
	/*
	*
	* 代理商
	* */
	@TableField(exist=false)
	private String agentName;
	/**
	 * 面额
	 *
	 * */
	@TableField(exist=false)
	private double cardTypeDenomination;

	@Override
	public String toString() {
		return "CardEntity{" +
				"cardId='" + cardId + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", cardAgentId='" + cardAgentId + '\'' +
				", cardTypeId=" + cardTypeId +
				", cardDueDate=" + cardDueDate +
				", cardStatus='" + cardStatus + '\'' +
				", cardOrderCreatetime=" + cardOrderCreatetime +
				", cardOrderModifytime=" + cardOrderModifytime +
				", cardCreatecardTime=" + cardCreatecardTime +
				", agentName='" + agentName + '\'' +
				", cardTypeDenomination=" + cardTypeDenomination +
				'}';
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardAgentId() {
		return cardAgentId;
	}

	public void setCardAgentId(String cardAgentId) {
		this.cardAgentId = cardAgentId;
	}

	public Integer getCardTypeId() {
		return cardTypeId;
	}

	public void setCardTypeId(Integer cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	public Date getCardDueDate() {
		return cardDueDate;
	}

	public void setCardDueDate(Date cardDueDate) {
		this.cardDueDate = cardDueDate;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Date getCardOrderCreatetime() {
		return cardOrderCreatetime;
	}

	public void setCardOrderCreatetime(Date cardOrderCreatetime) {
		this.cardOrderCreatetime = cardOrderCreatetime;
	}

	public Date getCardOrderModifytime() {
		return cardOrderModifytime;
	}

	public void setCardOrderModifytime(Date cardOrderModifytime) {
		this.cardOrderModifytime = cardOrderModifytime;
	}

	public Date getCardCreatecardTime() {
		return cardCreatecardTime;
	}

	public void setCardCreatecardTime(Date cardCreatecardTime) {
		this.cardCreatecardTime = cardCreatecardTime;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public double getCardTypeDenomination() {
		return cardTypeDenomination;
	}

	public void setCardTypeDenomination(double cardTypeDenomination) {
		this.cardTypeDenomination = cardTypeDenomination;
	}
}
