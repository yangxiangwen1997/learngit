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
@TableName("tb_order")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String orderId;
	/**
	 * 
	 */
	private String orderNumber;
	/**
	 * 
	 */
	private Integer orderAgentId;
	/**
	 * 
	 */
	private String orderStatus;
	/**
	 * 
	 */
	private Double orderMoney;
	/**
	 * 
	 */
	private String orderPayway;
	/**
	 * 
	 */
	private Double orderPayMoney;
	/**
	 * 
	 */
	private Date orderPayDate;
	/**
	 * 
	 */
	private Double orderExchange;
	/**
	 * 
	 */
	private Date orderCreatetime;
	/**
	 * 
	 */
	private Date orderModifytime;
	/**
	 * 
	 */
	private String orderCreateby;
	/**
	 * 
	 */
	private String orderModifyby;
	/**
	 * 
	 */
	private String orderDeleteFlag;

	@Override
	public String toString() {
		return "OrderEntity{" +
				"orderId='" + orderId + '\'' +
				", orderNumber='" + orderNumber + '\'' +
				", orderAgentId=" + orderAgentId +
				", orderStatus='" + orderStatus + '\'' +
				", orderMoney=" + orderMoney +
				", orderPayway='" + orderPayway + '\'' +
				", orderPayMoney=" + orderPayMoney +
				", orderPayDate=" + orderPayDate +
				", orderExchange=" + orderExchange +
				", orderCreatetime=" + orderCreatetime +
				", orderModifytime=" + orderModifytime +
				", orderCreateby='" + orderCreateby + '\'' +
				", orderModifyby='" + orderModifyby + '\'' +
				", orderDeleteFlag='" + orderDeleteFlag + '\'' +
				'}';
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getOrderAgentId() {
		return orderAgentId;
	}

	public void setOrderAgentId(Integer orderAgentId) {
		this.orderAgentId = orderAgentId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}

	public String getOrderPayway() {
		return orderPayway;
	}

	public void setOrderPayway(String orderPayway) {
		this.orderPayway = orderPayway;
	}

	public Double getOrderPayMoney() {
		return orderPayMoney;
	}

	public void setOrderPayMoney(Double orderPayMoney) {
		this.orderPayMoney = orderPayMoney;
	}

	public Date getOrderPayDate() {
		return orderPayDate;
	}

	public void setOrderPayDate(Date orderPayDate) {
		this.orderPayDate = orderPayDate;
	}

	public Double getOrderExchange() {
		return orderExchange;
	}

	public void setOrderExchange(Double orderExchange) {
		this.orderExchange = orderExchange;
	}

	public Date getOrderCreatetime() {
		return orderCreatetime;
	}

	public void setOrderCreatetime(Date orderCreatetime) {
		this.orderCreatetime = orderCreatetime;
	}

	public Date getOrderModifytime() {
		return orderModifytime;
	}

	public void setOrderModifytime(Date orderModifytime) {
		this.orderModifytime = orderModifytime;
	}

	public String getOrderCreateby() {
		return orderCreateby;
	}

	public void setOrderCreateby(String orderCreateby) {
		this.orderCreateby = orderCreateby;
	}

	public String getOrderModifyby() {
		return orderModifyby;
	}

	public void setOrderModifyby(String orderModifyby) {
		this.orderModifyby = orderModifyby;
	}

	public String getOrderDeleteFlag() {
		return orderDeleteFlag;
	}

	public void setOrderDeleteFlag(String orderDeleteFlag) {
		this.orderDeleteFlag = orderDeleteFlag;
	}
}
