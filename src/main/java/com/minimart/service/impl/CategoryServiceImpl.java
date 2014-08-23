package com.minimart.service.impl;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ext.Provider;

import java.util.List;
import com.minimart.model.Category;
import com.minimart.service.CategoryService;
import com.minimart.dao.CategoryDAO;
import com.minimart.dao.impl.CategoryDAOImpl;

@Provider
@Path("category")
public class CategoryServiceImpl implements CategoryService {

	protected CategoryDAO categoryDAO ;
	public CategoryServiceImpl() {
		this.categoryDAO = new CategoryDAOImpl();
	}
	
	@Path("add")
	@POST
	public int addCategory(Category category){
		return this.categoryDAO.addCategory(category);
	}
	
	@Path("update")
	@PUT
	public void updateCategory(Category category){
		this.categoryDAO.updateCategory(category);
	}
	
	@Path("{id}")
	@DELETE
	public void deleteCategory(@PathParam("id") int id){
		this.categoryDAO.deleteCategory(id);
	}
	
	@Path("{id}")
	@GET
	public Category getCategoryById(@PathParam("id") int id){
		return this.categoryDAO.getCategoryById(id);
	}
	
	@Path("all")
	@GET
	public List<Category> getAllCategories(){
		return this.categoryDAO.getAllCategories();
	}
	
	@Path("search")
	@POST
	public List<Category> getCategoriesByCriteria(Object criterion){
		return this.categoryDAO.getCategoriesByCriteria(criterion);
	}
}

