package com.minimart.service.impl;


import java.util.List;
import com.minimart.model.Brand;
import com.minimart.service.BrandService;
import com.minimart.dao.BrandDAO;
import com.minimart.dao.impl.BrandDAOImpl;

public class BrandServiceImpl implements BrandService {

	protected BrandDAO brandDAO ;
	public BrandServiceImpl() {
		this.brandDAO = new BrandDAOImpl();
	}
	
	public int addBrand(Brand brand){
		return this.brandDAO.addBrand(brand);
	}
	public void updateBrand(Brand brand){
		this.brandDAO.updateBrand(brand);
	}
	public void deleteBrand(int id){
		this.brandDAO.deleteBrand(id);
	}
	public Brand getBrandById(int id){
		return this.brandDAO.getBrandById(id);
	}
	public List<Brand> getAllBrands(){
		return this.brandDAO.getAllBrands();
	}
	public List<Brand> getBrandsByCriteria(Object criterion){
		return this.brandDAO.getBrandsByCriteria(criterion);
	}
}

