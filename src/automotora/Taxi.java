package automotora;

public class Taxi extends Vehiculo{
	
	private int valorPasaje;
	
	public Taxi(String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	public void pagarPasaje(int pasaje) {
		int vuelto = pasaje;
		if(pasaje> this.valorPasaje) {
			vuelto -= this.valorPasaje;
			System.out.println("Su vuelto es "+ vuelto);
		}else {
			System.out.println("Se devuelve" +pasaje);
		}
		
	}
	
}
