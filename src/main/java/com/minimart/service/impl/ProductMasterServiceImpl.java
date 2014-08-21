package com.minimart.service.impl;


import java.util.List;
import com.minimart.model.ProductMaster;
import com.minimart.service.ProductMasterService;
import com.minimart.dao.ProductMasterDAO;
import com.minimart.dao.impl.ProductMasterDAOImpl;

public class ProductMasterServiceImpl implements ProductMasterService {

	protected ProductMasterDAO productMasterDAO ;
	public ProductMasterServiceImpl() {
		this.productMasterDAO = new ProductMasterDAOImpl();
	}
	
	public int addProductMaster(ProductMaster productMaster){
		return this.productMasterDAO.addProductMaster(productMaster);
	}
	public void updateProductMaster(ProductMaster productMaster){
		this.productMasterDAO.updateProductMaster(productMaster);
	}
	public void deleteProductMaster(int id){
		this.productMasterDAO.deleteProductMaster(id);
	}
	public ProductMaster getProductMasterById(int id){
		return this.productMasterDAO.getProductMasterById(id);
	}
	public List<ProductMaster> getAllProductMasters(){
		return this.productMasterDAO.getAllProductMasters();
	}
	public List<ProductMaster> getProductMastersByCriteria(Object criterion){
		return this.productMasterDAO.getProductMastersByCriteria(criterion);
	}
}

