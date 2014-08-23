package com.minimart.model;

// Generated Aug 12, 2014 10:36:52 PM by Hibernate Tools 3.4.0.CR1

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.minimart.annotation.POSFieldAnnotation;
import com.minimart.annotation.POSModelAnnotation;

/**
 * InventoryItem generated by hbm2java
 */
@POSModelAnnotation(dbTableName="INVENTORY_ITEM")
@XmlRootElement
public class InventoryItem extends POSModel implements java.io.Serializable {

	@POSFieldAnnotation(dbColumnName = "id", jsonColumnName = "id")
	private Integer id;

	@POSFieldAnnotation(dbColumnName = "product_id", jsonColumnName = "product_id")
	private Integer productId;

	@POSFieldAnnotation(dbColumnName = "name", jsonColumnName = "name")
	private String name;
	
	@POSFieldAnnotation(dbColumnName = "tracking_code", jsonColumnName = "tracking_code")
	private String trackingCode;
	
	@POSFieldAnnotation(dbColumnName = "quantity", jsonColumnName = "quantity")
	private int quantity;

	@POSFieldAnnotation(dbColumnName = "received_date", jsonColumnName = "received_date")
	private Date receivedDate;

	@POSFieldAnnotation(dbColumnName = "expiry_date", jsonColumnName = "expiry_date")
	private Date expiryDate;
	
	@POSFieldAnnotation(dbColumnName = "promotional_offer", jsonColumnName = "promotional_offer")
	private String promotionalOffer;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the trackingCode
	 */
	public String getTrackingCode() {
		return trackingCode;
	}

	/**
	 * @param trackingCode the trackingCode to set
	 */
	public void setTrackingCode(String trackingCode) {
		this.trackingCode = trackingCode;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the receivedDate
	 */
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * @param receivedDate the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the promotionalOffer
	 */
	public String getPromotionalOffer() {
		return promotionalOffer;
	}

	/**
	 * @param promotionalOffer the promotionalOffer to set
	 */
	public void setPromotionalOffer(String promotionalOffer) {
		this.promotionalOffer = promotionalOffer;
	}

	/**
	 * 
	 */
	public InventoryItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadFromResultSet(ResultSet resultSet) throws SQLException {
		
		this.id = resultSet.getInt("id");
		this.productId = resultSet.getInt("product_id");
		this.name = resultSet.getString("name");
		this.trackingCode = resultSet.getString("tracking_code");
		this.quantity = resultSet.getInt("quantity");
		this.receivedDate = resultSet.getDate("received_date");
		this.expiryDate = resultSet.getDate("expiry_date");
		this.promotionalOffer = resultSet.getString("promotional_offer");
	}

	@Override
	public Object[] toObjectArray(boolean includeId) {

		if (includeId) {
			Object[] params = { this.productId, this.name, this.trackingCode, this.quantity, this.receivedDate, this.expiryDate, this.promotionalOffer, this.id};
			return params;
		} else {
			Object[] params = { this.productId, this.name, this.trackingCode, this.quantity, this.receivedDate, this.expiryDate, this.promotionalOffer};
			return params;
		}
	}	
}
