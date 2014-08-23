package com.minimart.service.impl;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ext.Provider;

import java.util.List;
import com.minimart.model.Product;
import com.minimart.service.ProductService;
import com.minimart.dao.ProductDAO;
import com.minimart.dao.impl.ProductDAOImpl;

@Provider
@Path("product")
public class ProductServiceImpl implements ProductService {

	protected ProductDAO productDAO ;
	public ProductServiceImpl() {
		this.productDAO = new ProductDAOImpl();
	}
	
	@Path("add")
	@POST
	public int addProduct(Product product){
		return this.productDAO.addProduct(product);
	}
	
	@Path("update")
	@PUT
	public void updateProduct(Product product){
		this.productDAO.updateProduct(product);
	}
	
	@Path("{id}")
	@DELETE
	public void deleteProduct(@PathParam("id") int id){
		this.productDAO.deleteProduct(id);
	}
	
	@Path("{id}")
	@GET
	public Product getProductById(@PathParam("id") int id){
		return this.productDAO.getProductById(id);
	}
	
	@Path("all")
	@GET
	public List<Product> getAllProducts(){
		return this.productDAO.getAllProducts();
	}
	
	@Path("search")
	@POST
	public List<Product> getProductsByCriteria(Object criterion){
		return this.productDAO.getProductsByCriteria(criterion);
	}
}

