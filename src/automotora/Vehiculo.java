package automotora;

public class Vehiculo {
	protected String color;
	protected String patente;
	
	public Vehiculo(String color, String patente) {
		super();
		this.color = color;
		this.patente = patente;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	

}
