package maquinaria;

import java.util.ArrayList;

import personal.Responsable;

public abstract class Maquinaria implements Comparable<Maquinaria> {

	private static int ID = 1;
	
	protected int id = 0;
	protected float valor;
	protected int vidaUtil;
	protected String marca;
	protected String descripcion;
	protected ArrayList<Mantenimiento> mantenimientos;
	protected Responsable responsable;
	
	public Maquinaria(float valor, int vidaUtil, String marca, String descripcion) {
		this.valor = valor;
		this.vidaUtil = vidaUtil;
		this.marca = marca;
		this.descripcion = descripcion;
		this.mantenimientos = new ArrayList<>();
		this.id = ID;
		ID++;
	}

	public abstract String obtenerTablaDepreciacion();
	
	public String obtenerTablaMantenimientos() {
		if(mantenimientos.size() == 0) {
			return "No se han realizado mantenimientos";
		}
		String resultado = "Fecha -> Costo -> Descripcion \n";
		for(int i = 0; i < mantenimientos.size(); i++) {
			Mantenimiento mantenimiento = mantenimientos.get(i);
			resultado += mantenimiento.getFecha() + " -> " + Integer.toString(mantenimiento.getCosto()) + " -> " + mantenimiento.getDescripcion() + "\n";
		}
		return resultado;
	}
	
	public int getId() {
		return id;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public ArrayList<Mantenimiento> getMantenimientos() {
		return mantenimientos;
	}
	
	public void agregarMantenimiento(int costo, String fecha, String descripcion) {
		Mantenimiento mantenimiento = new Mantenimiento(costo, fecha, descripcion);
		mantenimientos.add(mantenimiento);
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public int compareTo(Maquinaria o) {
		return Float.compare(valor, o.valor);
	}
	
}
