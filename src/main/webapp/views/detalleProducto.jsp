<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.Producto" %>
<%@ page import= "shared.Constants" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>GALACTUS STORE | SISE</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<script src="https://unpkg.com/@tailwindcss/browser@4"></script>
</head>
<body>

	<%
    	Producto producto = (Producto) request.getAttribute("producto");
	%>

	<header>
		<div class="flex gap-4 bg-green-600 justify-center h-[50px] items-center">
			<a href="/galactus-store" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer">Inicio</a>
			<a href="/galactus-store/categorias" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer border border-white border-solid">Categorías</a>
			<a class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer">Marcas</a>
		</div>
	</header>
	
	<div class="h-5"></div>
	<div class="p-6">
		<p class="text-5xl font-bold"> <%= producto.getNombre() %></p>
		<p class="text-green-600 text-xl font-bold"> <%= producto.getDescripcion()%></p>
	</div>
	
	<main class="grid grid-cols-1 md:grid-cols-2 gap-8 h-screen items-center p-6">
	    <div class="rounded-lg shadow-lg p-4 flex justify-center">
	        <img class="rounded-md w-full max-w-1xl" 
	             src="<%= producto.getImagenUrl() != null ? producto.getImagenUrl() : Constants.IMAGEN_PRODUCTO_DEFAULT %>">
	    </div>

	    <div class="flex flex-col gap-4 border border-gray-300 rounded-lg shadow-lg p-6">
	    	<p class="text-xl font-bold">Modelo: <%= producto.getModelo() %></p>
	    	<p class="text-red-500 text-xl font-semibold font-bold">Stock: <%= producto.getStock() %></p>
	        <p class="text-blue-500 text-3xl font-bold flex justify-center "> - S/ <%= producto.getPrecio() %> -</p>
	        <p class=" text-xl font-bold ">Garantia: <%= producto.getTiempoGarantiaMeses() %> meses</p>
	    </div>
	</main>

	
</body>
</html>








