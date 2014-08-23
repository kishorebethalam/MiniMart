package com.minimart.model;

// Generated Aug 12, 2014 10:36:52 PM by Hibernate Tools 3.4.0.CR1

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;

import com.minimart.annotation.POSFieldAnnotation;
import com.minimart.annotation.POSModelAnnotation;

/**
 * Brand generated by hbm2java
 */
@XmlRootElement
@POSModelAnnotation(dbTableName = "BRAND")
public class Brand extends POSModel implements java.io.Serializable {

	@POSFieldAnnotation(dbColumnName = "id", jsonColumnName = "id")
	private Integer id;

	@POSFieldAnnotation(dbColumnName = "manufacturer_id", jsonColumnName = "manufacturer_id")
	private Integer manufacturerId;

	@POSFieldAnnotation(dbColumnName = "name", jsonColumnName = "name")
	private String name;

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
	 * @return the manufacturerId
	 */
	public Integer getManufacturerId() {
		return manufacturerId;
	}

	/**
	 * @param manufacturerId
	 *            the manufacturerId to set
	 */
	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Brand [id=" + id + ", manufacturerId=" + manufacturerId
				+ ", name=" + name + "]";
	}

	@Override
	public void loadFromResultSet(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getInt("id");
		this.name = resultSet.getString("name");
		this.manufacturerId = resultSet.getInt("manufacturer_id");
	}

	@Override
	public Object[] toObjectArray(boolean includeId) {

		if (includeId) {
			Object[] params = { this.manufacturerId, this.name, this.id, 
					};
			return params;
		} else {
			Object[] params = { this.manufacturerId , this.name
					};
			return params;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((manufacturerId == null) ? 0 : manufacturerId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Brand)) {
			return false;
		}
		Brand other = (Brand) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (manufacturerId == null) {
			if (other.manufacturerId != null) {
				return false;
			}
		} else if (!manufacturerId.equals(other.manufacturerId)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
