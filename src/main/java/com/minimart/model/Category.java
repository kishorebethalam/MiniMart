package com.minimart.model;

// Generated Aug 12, 2014 10:36:52 PM by Hibernate Tools 3.4.0.CR1

import java.sql.ResultSet;
import java.sql.SQLException;

import com.minimart.annotation.POSFieldAnnotation;
import com.minimart.annotation.POSModelAnnotation;

/**
 * Category generated by hbm2java
 */
@POSModelAnnotation(dbTableName="CATEGORY")
public class Category extends POSModel implements java.io.Serializable {

	@POSFieldAnnotation(dbColumnName = "id", jsonColumnName = "id")
	private Integer id;

	@POSFieldAnnotation(dbColumnName = "category_id", jsonColumnName = "category_id")
	private Integer categoryId;
	
	@POSFieldAnnotation(dbColumnName = "name", jsonColumnName = "name")
	private String name;

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
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
	 * 
	 */
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadFromResultSet(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getInt("id");
		this.categoryId = resultSet.getInt("category_id");
		this.name = resultSet.getString("name");
	}

	@Override
	public Object[] toObjectArray(boolean includeId) {

		if (includeId) {
			Object[] params = { this.categoryId, this.name, this.id};
			return params;
		} else {
			Object[] params = { this.categoryId, this.name};
			return params;
		}
	}

	
}
