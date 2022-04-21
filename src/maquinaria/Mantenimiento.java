package maquinaria;

public class Mantenimiento {

	private int costo;
	private String fecha;
	private String descripcion;
	
	public Mantenimiento(int costo, String fecha, String descripcion) {
		this.costo = costo;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}
	
	public int getCosto() {
		return costo;
	}
	
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
