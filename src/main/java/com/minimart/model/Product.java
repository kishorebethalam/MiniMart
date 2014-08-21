package com.minimart.model;

// Generated Aug 12, 2014 10:36:52 PM by Hibernate Tools 3.4.0.CR1

import java.sql.ResultSet;
import java.sql.SQLException;

import com.minimart.annotation.POSFieldAnnotation;
import com.minimart.annotation.POSModelAnnotation;

/**
 * Product generated by hbm2java
 */
@POSModelAnnotation(dbTableName = "PRODUCT")
public class Product extends POSModel implements java.io.Serializable {



	@POSFieldAnnotation(dbColumnName = "id", jsonColumnName = "id")
	private Integer id;

	@POSFieldAnnotation(dbColumnName = "product_master_id", jsonColumnName = "product_master_id")
	private Integer productMasterId;

	@POSFieldAnnotation(dbColumnName = "measurement_category", jsonColumnName = "measurement_category")
	private String measurementCategory;

	@POSFieldAnnotation(dbColumnName = "measurement_quantity", jsonColumnName = "measurement_quantity")
	private int measurementQuantity;

	@POSFieldAnnotation(dbColumnName = "mrp", jsonColumnName = "mrp")
	private float mrp;

	@POSFieldAnnotation(dbColumnName = "selling_price", jsonColumnName = "selling_price")
	private float sellingPrice;

	@POSFieldAnnotation(dbColumnName = "bought_price", jsonColumnName = "bought_price")
	private float boughtPrice;

	@POSFieldAnnotation(dbColumnName = "reorder_volume", jsonColumnName = "reorder_volume")
	private int reorderVolume;

	@POSFieldAnnotation(dbColumnName = "reorder_frequency", jsonColumnName = "reorder_frequency")
	private int reorderFrequency;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the productMasterId
	 */
	public Integer getProductMasterId() {
		return productMasterId;
	}

	/**
	 * @param productMasterId
	 *            the productMasterId to set
	 */
	public void setProductMasterId(Integer productMasterId) {
		this.productMasterId = productMasterId;
	}

	/**
	 * @return the measurementCategory
	 */
	public String getMeasurementCategory() {
		return measurementCategory;
	}

	/**
	 * @param measurementCategory
	 *            the measurementCategory to set
	 */
	public void setMeasurementCategory(String measurementCategory) {
		this.measurementCategory = measurementCategory;
	}

	/**
	 * @return the measurementQuantity
	 */
	public int getMeasurementQuantity() {
		return measurementQuantity;
	}

	/**
	 * @param measurementQuantity
	 *            the measurementQuantity to set
	 */
	public void setMeasurementQuantity(int measurementQuantity) {
		this.measurementQuantity = measurementQuantity;
	}

	/**
	 * @return the mrp
	 */
	public float getMrp() {
		return mrp;
	}

	/**
	 * @param mrp
	 *            the mrp to set
	 */
	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	/**
	 * @return the sellingPrice
	 */
	public float getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * @param sellingPrice
	 *            the sellingPrice to set
	 */
	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * @return the boughtPrice
	 */
	public float getBoughtPrice() {
		return boughtPrice;
	}

	/**
	 * @param boughtPrice
	 *            the boughtPrice to set
	 */
	public void setBoughtPrice(float boughtPrice) {
		this.boughtPrice = boughtPrice;
	}

	/**
	 * @return the reorderVolume
	 */
	public int getReorderVolume() {
		return reorderVolume;
	}

	/**
	 * @param reorderVolume
	 *            the reorderVolume to set
	 */
	public void setReorderVolume(int reorderVolume) {
		this.reorderVolume = reorderVolume;
	}

	/**
	 * @return the reorderFrequency
	 */
	public int getReorderFrequency() {
		return reorderFrequency;
	}

	/**
	 * @param reorderFrequency
	 *            the reorderFrequency to set
	 */
	public void setReorderFrequency(int reorderFrequency) {
		this.reorderFrequency = reorderFrequency;
	}

	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadFromResultSet(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getInt("id");
		this.productMasterId = resultSet.getInt("id");
		this.measurementCategory= resultSet.getString("measurement_category"); 
		this.measurementQuantity = resultSet.getInt("measurement_quantity");
		this.mrp = resultSet.getFloat("mrp");
		this.sellingPrice = resultSet.getFloat("selling_price");
		this.boughtPrice = resultSet.getFloat("bought_price");
		this.reorderVolume = resultSet.getInt("reorder_volume");
		this.reorderFrequency = resultSet.getInt("reorder_frequency");
	}

	@Override
	public Object[] toObjectArray(boolean includeId) {

		if (includeId) {
			Object[] params = { this.productMasterId,
					this.measurementCategory, this.measurementQuantity,
					this.mrp, this.sellingPrice, this.boughtPrice,
					this.reorderVolume, this.reorderFrequency, this.id };
			return params;
		} else {
			Object[] params = { this.productMasterId, this.measurementCategory,
					this.measurementQuantity, this.mrp, this.sellingPrice,
					this.boughtPrice, this.reorderVolume, this.reorderFrequency };
			return params;
		}
	}
}
