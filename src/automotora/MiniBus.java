package automotora;

public class MiniBus extends Bus{

	private String tipoDeViaje;

	public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoDeViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoDeViaje = tipoDeViaje;
	}

	public String getTipoDeViaje() {
		return tipoDeViaje;
	}

	public void setTipoDeViaje(String tipoDeViaje) {
		this.tipoDeViaje = tipoDeViaje;
	}
	
	public void imprimeBus() {
		
	}
	
	
}
