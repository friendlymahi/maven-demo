package com.demo.sample.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.demo.sample.bo.ProductBO;
import com.demo.sample.dto.Product;

/**
 * Servlet implementation class DisplayProductServlet
 */
public class DisplayProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		ProductBO bo = (ProductBO) context.getBean("productbobean"); 
		
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		
		if(product != null)
		{
			out.println(product.getDescription() +"::" + product.getPrice());
		}
		else
		{
			out.println("Sorry. No match found !");
		}
	}

}
