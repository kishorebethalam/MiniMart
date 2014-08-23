package com.minimart.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import java.util.List;
import com.minimart.model.Brand;
import com.minimart.service.BrandService;
import com.minimart.dao.BrandDAO;
import com.minimart.dao.impl.BrandDAOImpl;

@Provider
@Path("brand")
public class BrandServiceImpl implements BrandService {

	protected BrandDAO brandDAO ;
	public BrandServiceImpl() {
		this.brandDAO = new BrandDAOImpl();
	}
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public int addBrand(Brand brand){
		return this.brandDAO.addBrand(brand);
	}
	
	@Path("/")
	@PUT
	public void updateBrand(Brand brand){
		this.brandDAO.updateBrand(brand);
	}
	
	@Path("{id}")
	@DELETE
	public void deleteBrand(int id){
		this.brandDAO.deleteBrand(id);
	}
	
	@Path("{id}")
	@GET
	public Brand getBrandById(int id){
		return this.brandDAO.getBrandById(id);
	}
	
	@Path("all")
	@GET
	public List<Brand> getAllBrands(){
		return this.brandDAO.getAllBrands();
	}
	
	@Path("search")
	@POST
	public List<Brand> getBrandsByCriteria(Object criterion){
		return this.brandDAO.getBrandsByCriteria(criterion);
	}
}

