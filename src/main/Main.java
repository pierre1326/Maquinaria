package main;

import java.util.ArrayList;
import java.util.Collections;

import maquinaria.Equipo;
import maquinaria.Herramienta;
import maquinaria.Maquinaria;
import personal.Responsable;

public class Main {

	public static void main(String[] args) {		
		
		ArrayList<Responsable> responsables = new ArrayList<>();
		ArrayList<Maquinaria> maquinarias = new ArrayList<>();
		
		Responsable r1 = new Responsable("1", "13 de Agosto de 1998", "Brenda");
		Responsable r2 = new Responsable("2", "13 de Agosto de 1998", "Allan");
		Responsable r3 = new Responsable("3", "13 de Agosto de 1998", "Carlos");
		
		Maquinaria e1 = new Equipo(9000000, 5, "Marca e1", "Producto e1", 5, 10);
		Maquinaria e2 = new Equipo(4000000, 6, "Marca e2", "Producto e2", 6, 11);
		Maquinaria e3 = new Equipo(7000000, 7, "Marca e3", "Producto e3", 7, 12);
	
		Maquinaria h1 = new Herramienta(8000000, 5, "Marca h1", "Producto h1", 100000, 0.36904f);
		Maquinaria h2 = new Herramienta(2000000, 5, "Marca h2", "Producto h2", 100000, 0.36904f);
		Maquinaria h3 = new Herramienta(3000000, 5, "Marca h3", "Producto h3", 100000, 0.36904f);
		
		e1.setResponsable(r1);
		h1.setResponsable(r1);
		
		e2.setResponsable(r2);
		h3.setResponsable(r2);
		
		e3.setResponsable(r3);
		h3.setResponsable(r3);
		
		r1.agregarMaquinaria(e1);
		r1.agregarMaquinaria(h1);
		
		r2.agregarMaquinaria(e2);
		r2.agregarMaquinaria(h2);
		
		r3.agregarMaquinaria(e3);
		r3.agregarMaquinaria(h3);
		
		responsables.add(r1);
		responsables.add(r2);
		responsables.add(r3);
		
		maquinarias.add(e1);
		maquinarias.add(e2);
		maquinarias.add(e3);
		maquinarias.add(h1);
		maquinarias.add(h2);
		maquinarias.add(h3);
		
		e2.agregarMantenimiento(50000, "10 de Noviembre, 2021", "Revision mensual");
		h2.agregarMantenimiento(60000, "11 de Agosto, 2021", "Corto circuito");
		e2.agregarMantenimiento(70000, "12 de Julio, 2021", "Cambio de piezas");
		h2.agregarMantenimiento(80000, "13 de Febreroo, 2021", "Revision trimestral");
		
		System.out.println(e2.obtenerTablaDepreciacion());
		System.out.println(h2.obtenerTablaDepreciacion());
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		Responsable r4 = new Responsable("4", "13 de Agosto de 1998", "Sofia");
		Responsable r5 = new Responsable("5", "13 de Agosto de 1998", "Diego");
		Responsable r6 = new Responsable("6", "13 de Agosto de 1998", "Julio");
		
		responsables.add(r4);
		responsables.add(r5);
		responsables.add(r6);
		
		for(int i = 0; i < responsables.size(); i++) {
			System.out.println(responsables.get(i).toString());
		}
		
		Collections.sort(responsables);
		
		for(int i = 0; i < responsables.size(); i++) {
			System.out.println(responsables.get(i).toString());
		}
		
		for(int i = 0; i < maquinarias.size(); i++) {
			System.out.println(maquinarias.get(i).toString());
		}
		
		Collections.sort(maquinarias);
		
		for(int i = 0; i < maquinarias.size(); i++) {
			System.out.println(maquinarias.get(i).toString());
		}
		
	}
	
}
