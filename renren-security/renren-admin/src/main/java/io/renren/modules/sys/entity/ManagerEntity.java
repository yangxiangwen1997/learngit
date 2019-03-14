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
@TableName("tb_manager")
public class ManagerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer managerId;
	/**
	 * 
	 */
	private Integer managerCardId;
	/**
	 * 
	 */
	private String managerOrderId;
	/**
	 * 
	 */
	private Integer managerCardNumber;

}
