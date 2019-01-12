package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.javawebavanzado.sesion03.exception.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Producto;

public class GestionProductos {
	
	static HashMap<Integer, Collection<Producto>> 
		productosXcategorias = new HashMap<Integer, Collection<Producto>>(); 
	
	static {
		productosXcategorias.put(new Integer(1), 
					Arrays.asList(new Producto(10,"Smartphone","Smartphone","phone"),
								  new Producto(11,"Tablet","Tablet","tablet")));
		productosXcategorias.put(new Integer(2), 
				Arrays.asList(new Producto(20,"La Casa Verde","La Casa Verde","verde"),
							  new Producto(21,"El Capitan Grant","El Capitan Grant","capitan")));
		productosXcategorias.put(new Integer(3), 
				Arrays.asList(new Producto(30,"Futbol","Futbol","futbol"),
							  new Producto(31,"Voley","Voley","voley")));
	
	}
	
	public Collection<Producto> listarPorCategoria(int idCategoria) throws DAOExcepcion {
		// TODO Auto-generated method stub
		return productosXcategorias.get(idCategoria);
	}
	
}
