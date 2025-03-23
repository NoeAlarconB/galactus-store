package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Producto;
import services.ProductoService;
import services.impl.ProductoServiceImpl;

@WebServlet("/detalleProducto")
public class DetalleProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProductoService productoService;

    public DetalleProductoServlet() {
        super();
        productoService = new ProductoServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer idProducto = Integer.parseInt(request.getParameter("idProducto"));
        Producto producto = productoService.obtenerDetalleProductoPorId(idProducto);

        request.setAttribute("producto", producto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/detalleProducto.jsp");
        dispatcher.forward(request, response);
	}

}
