package com.minimart;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.sun.jersey.spi.container.servlet.ServletContainer;
 
public class MinimalServerRest {

	public static void main(String[] args) throws Exception {
    	 
         ServletHolder sh = new ServletHolder(ServletContainer.class);
         sh.setInitOrder(1);
    	 sh.setInitParameter("jersey.config.server.provider.packages","com.minimart.model");
    	 sh.setInitParameter("com.sun.jersey.config.property.packages", "com.minimart.service.impl");
    	 sh.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
    	 
         Server server = new Server(Integer.parseInt(Configuration.getAppProperty("Port")));
         ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
         context.addServlet(sh, "/*");
         server.start();
         server.join();      
      }
}