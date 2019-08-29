package com.zscat.core.model;

import java.io.Serializable;
import java.util.Date;

public class PmsMerchandise extends RuisModelObj implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.product_id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private String productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.name
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.picture
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private String picture;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.unit_price
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private String unitPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.classification_of_food
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private String classificationOfFood;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.store_merchandise_id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer storeMerchandiseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.order_state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer orderState;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.evaluate_state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer evaluateState;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.create_by
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer createBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.create_date
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.update_by
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer updateBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.update_date
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.remarks
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer remarks;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.enable
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private Integer enable;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pms_merchandise.number
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.id
	 * @return  the value of pms_merchandise.id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.id
	 * @param id  the value for pms_merchandise.id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.product_id
	 * @return  the value of pms_merchandise.product_id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.product_id
	 * @param productId  the value for pms_merchandise.product_id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.name
	 * @return  the value of pms_merchandise.name
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.name
	 * @param name  the value for pms_merchandise.name
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.picture
	 * @return  the value of pms_merchandise.picture
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.picture
	 * @param picture  the value for pms_merchandise.picture
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.unit_price
	 * @return  the value of pms_merchandise.unit_price
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public String getUnitPrice() {
		return unitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.unit_price
	 * @param unitPrice  the value for pms_merchandise.unit_price
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.classification_of_food
	 * @return  the value of pms_merchandise.classification_of_food
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public String getClassificationOfFood() {
		return classificationOfFood;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.classification_of_food
	 * @param classificationOfFood  the value for pms_merchandise.classification_of_food
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setClassificationOfFood(String classificationOfFood) {
		this.classificationOfFood = classificationOfFood;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.store_merchandise_id
	 * @return  the value of pms_merchandise.store_merchandise_id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getStoreMerchandiseId() {
		return storeMerchandiseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.store_merchandise_id
	 * @param storeMerchandiseId  the value for pms_merchandise.store_merchandise_id
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setStoreMerchandiseId(Integer storeMerchandiseId) {
		this.storeMerchandiseId = storeMerchandiseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.state
	 * @return  the value of pms_merchandise.state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.state
	 * @param state  the value for pms_merchandise.state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.order_state
	 * @return  the value of pms_merchandise.order_state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getOrderState() {
		return orderState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.order_state
	 * @param orderState  the value for pms_merchandise.order_state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.evaluate_state
	 * @return  the value of pms_merchandise.evaluate_state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getEvaluateState() {
		return evaluateState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.evaluate_state
	 * @param evaluateState  the value for pms_merchandise.evaluate_state
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setEvaluateState(Integer evaluateState) {
		this.evaluateState = evaluateState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.create_by
	 * @return  the value of pms_merchandise.create_by
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getCreateBy() {
		return createBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.create_by
	 * @param createBy  the value for pms_merchandise.create_by
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.create_date
	 * @return  the value of pms_merchandise.create_date
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.create_date
	 * @param createDate  the value for pms_merchandise.create_date
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.update_by
	 * @return  the value of pms_merchandise.update_by
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getUpdateBy() {
		return updateBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.update_by
	 * @param updateBy  the value for pms_merchandise.update_by
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.update_date
	 * @return  the value of pms_merchandise.update_date
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.update_date
	 * @param updateDate  the value for pms_merchandise.update_date
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.remarks
	 * @return  the value of pms_merchandise.remarks
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getRemarks() {
		return remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.remarks
	 * @param remarks  the value for pms_merchandise.remarks
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setRemarks(Integer remarks) {
		this.remarks = remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pms_merchandise.enable
	 * @return  the value of pms_merchandise.enable
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public Integer getEnable() {
		return enable;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pms_merchandise.enable
	 * @param enable  the value for pms_merchandise.enable
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pms_merchandise
	 * @mbg.generated  Tue Jul 30 11:42:56 CST 2019
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", productId=").append(productId);
		sb.append(", name=").append(name);
		sb.append(", picture=").append(picture);
		sb.append(", unitPrice=").append(unitPrice);
		sb.append(", classificationOfFood=").append(classificationOfFood);
		sb.append(", storeMerchandiseId=").append(storeMerchandiseId);
		sb.append(", state=").append(state);
		sb.append(", orderState=").append(orderState);
		sb.append(", evaluateState=").append(evaluateState);
		sb.append(", createBy=").append(createBy);
		sb.append(", createDate=").append(createDate);
		sb.append(", updateBy=").append(updateBy);
		sb.append(", updateDate=").append(updateDate);
		sb.append(", remarks=").append(remarks);
		sb.append(", enable=").append(enable);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}