package automotora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {

	String nombreVenta;
	String fechaVenta;
	
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
		cliente.getEdad();
		vehiculo.getPatente();
		File ficheros = new File("src/ficheros/");
		File archivo = new File("src/ficheros/" + this.nombreVenta + ".txt");
		String data;
		
	        if (!ficheros.exists()) {
	            ficheros.mkdir();
	        }
	        if (!archivo.exists()) {
	        	try {
	        		archivo.createNewFile();
	        		FileWriter fw = new FileWriter(archivo);
	        		BufferedWriter bw = new BufferedWriter(fw);
	        		data = nombreVenta + "\nFecha: " + fechaVenta + "\nPatente vehículo: " + vehiculo.getPatente()  + "\nEdad cliente: " + cliente.getEdad();
	        		bw.write(data);
	        		bw.close();
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }
	}
}
