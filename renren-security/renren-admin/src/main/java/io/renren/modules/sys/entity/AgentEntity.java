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
@TableName("tb_agent")
public class AgentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer agentId;
	/**
	 * 
	 */
	private String agentName;
	/**
	 * 
	 */
	private Double agentDiscount;
	/**
	 * 
	 */
	private Double agentChangemoney;
	/**
	 * 
	 */
	private Double agentSolemoney;
	/**
	 * 
	 */
	private String agentStatus;
	/**
	 * 
	 */
	private String agentLinkman;
	/**
	 * 
	 */
	private String agentPassword;
	/**
	 * 
	 */
	private String agentPhone;
	/**
	 * 
	 */
	private String agentEmail;
	/**
	 * 
	 */
	private String agentAddress;
	/**
	 * 
	 */
	private Date agentCreatetime;
	/**
	 * 
	 */
	private Date agentModifytime;

	@Override
	public String toString() {
		return "AgentEntity{" +
				"agentId=" + agentId +
				", agentName='" + agentName + '\'' +
				", agentDiscount=" + agentDiscount +
				", agentChangemoney=" + agentChangemoney +
				", agentSolemoney=" + agentSolemoney +
				", agentStatus='" + agentStatus + '\'' +
				", agentLinkman='" + agentLinkman + '\'' +
				", agentPassword='" + agentPassword + '\'' +
				", agentPhone='" + agentPhone + '\'' +
				", agentEmail='" + agentEmail + '\'' +
				", agentAddress='" + agentAddress + '\'' +
				", agentCreatetime=" + agentCreatetime +
				", agentModifytime=" + agentModifytime +
				'}';
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Double getAgentDiscount() {
		return agentDiscount;
	}

	public void setAgentDiscount(Double agentDiscount) {
		this.agentDiscount = agentDiscount;
	}

	public Double getAgentChangemoney() {
		return agentChangemoney;
	}

	public void setAgentChangemoney(Double agentChangemoney) {
		this.agentChangemoney = agentChangemoney;
	}

	public Double getAgentSolemoney() {
		return agentSolemoney;
	}

	public void setAgentSolemoney(Double agentSolemoney) {
		this.agentSolemoney = agentSolemoney;
	}

	public String getAgentStatus() {
		return agentStatus;
	}

	public void setAgentStatus(String agentStatus) {
		this.agentStatus = agentStatus;
	}

	public String getAgentLinkman() {
		return agentLinkman;
	}

	public void setAgentLinkman(String agentLinkman) {
		this.agentLinkman = agentLinkman;
	}

	public String getAgentPassword() {
		return agentPassword;
	}

	public void setAgentPassword(String agentPassword) {
		this.agentPassword = agentPassword;
	}

	public String getAgentPhone() {
		return agentPhone;
	}

	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

	public String getAgentEmail() {
		return agentEmail;
	}

	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}

	public String getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(String agentAddress) {
		this.agentAddress = agentAddress;
	}

	public Date getAgentCreatetime() {
		return agentCreatetime;
	}

	public void setAgentCreatetime(Date agentCreatetime) {
		this.agentCreatetime = agentCreatetime;
	}

	public Date getAgentModifytime() {
		return agentModifytime;
	}

	public void setAgentModifytime(Date agentModifytime) {
		this.agentModifytime = agentModifytime;
	}
}
