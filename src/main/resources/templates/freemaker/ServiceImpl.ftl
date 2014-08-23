package ${serviceImplPackage};

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
import ${modelPackage}.${className};
import ${servicePackage}.${className}Service;
import ${daoPackage}.${className}DAO;
import ${daoImplPackage}.${className}DAOImpl;

@Provider
@Path("${variableName}")
public class ${className}ServiceImpl implements ${className}Service {

	protected ${className}DAO ${variableName}DAO ;
	public ${className}ServiceImpl() {
		this.${variableName}DAO = new ${className}DAOImpl();
	}
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public int add${className}(${className} ${variableName}){
		return this.${variableName}DAO.add${className}(${variableName});
	}
	
	@Path("/")
	@PUT
	public void update${className}(${className} ${variableName}){
		this.${variableName}DAO.update${className}(${variableName});
	}
	
	@Path("{id}")
	@DELETE
	public void delete${className}(int id){
		this.${variableName}DAO.delete${className}(id);
	}
	
	@Path("{id}")
	@GET
	public ${className} get${className}ById(int id){
		return this.${variableName}DAO.get${className}ById(id);
	}
	
	@Path("all")
	@GET
	public List<${className}> getAll${classNamePlural}(){
		return this.${variableName}DAO.getAll${classNamePlural}();
	}
	
	@Path("search")
	@POST
	public List<${className}> get${classNamePlural}ByCriteria(Object criterion){
		return this.${variableName}DAO.get${classNamePlural}ByCriteria(criterion);
	}
}

