package models;

import java.sql.Date;

public class Producto {
	private Integer idProducto;
	private Integer idMarca;
	private Integer idSubcategoria;
	private Integer idProveedor;
	private String codigoInterno;
	private String codigoExterno;
	private String nombre;
	private String descripcion;
	private String modelo;
	private Integer tiempoGarantiaMeses;
	private Float precio;
	private Integer stock;
	private Date fechaCompra;
	private Date fechaCreacion;
	private String nombreIma;
	private String imagenUrl;
	private String nombreMarca;
	private String imagenMarca;
	
	
	public String getNombreIma() {
		return nombreIma;
	}
	public void setNombreIma(String nombreIma) {
		this.nombreIma = nombreIma;
	}
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	public String getImagenMarca() {
		return imagenMarca;
	}
	public void setImagenMarca(String imagenMarca) {
		this.imagenMarca = imagenMarca;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public Integer getIdSubcategoria() {
		return idSubcategoria;
	}
	public void setIdSubcategoria(Integer idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public String getCodigoExterno() {
		return codigoExterno;
	}
	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getTiempoGarantiaMeses() {
		return tiempoGarantiaMeses;
	}
	public void setTiempoGarantiaMeses(Integer tiempoGarantiaMeses) {
		this.tiempoGarantiaMeses = tiempoGarantiaMeses;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
