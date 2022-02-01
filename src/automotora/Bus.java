package automotora;

public class Bus extends Vehiculo{

	protected int cantidadDeAsientos;

	public Bus(String color, String patente, int cantidadDeAsientos) {
		super(color, patente);
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	
	public int asientosDisponibles(int asientosOcupados) {
		int asientosDisponibles = this.cantidadDeAsientos - asientosOcupados;
		return asientosDisponibles;
	}
}
