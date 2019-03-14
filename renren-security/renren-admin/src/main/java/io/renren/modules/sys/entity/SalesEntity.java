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
@TableName("tb_sales")
public class SalesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String salesNumber;
	/**
	 * 
	 */
	private String salesOrderNumber;
	/**
	 * 
	 */
	private Date salesTime;
	/**
	 * 
	 */
	private Double amoutOfSalesorder;
	/**
	 * 
	 */
	private Integer numberOfSalescard;
	/**
	 * 
	 */
	private Double exchhangedAmount;

}
