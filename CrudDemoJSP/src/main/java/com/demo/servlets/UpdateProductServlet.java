package com.demo.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.beans.Product;
import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet("/updateprod")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
    	String pname=request.getParameter("pname");
    	int qty=Integer.parseInt(request.getParameter("qty"));
    	double price=Double.parseDouble(request.getParameter("price"));
    	String dt=request.getParameter("expdate");
    	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    	int cid=Integer.parseInt(request.getParameter("cid"));
    	Product p=new Product(pid,pname,qty,price,ldt,cid);
    	ProductService pservice=new ProductServiceImpl();
    	pservice.updateProduct(p);
    	RequestDispatcher rd=request.getRequestDispatcher("showprod");
    	rd.forward(request, response);;
	}

}
