package main;

import automotora.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxiUno = new Taxi("azul", "AABB11", 1000);
		taxiUno.pagarPasaje(1500);
		MiniBus miniBusUno = new MiniBus("rojo", "CCDD22", 16, "Inter Urbano");
		miniBusUno.imprimeBus();
		System.out.println("Asientos disponibles: " + miniBusUno.asientosDisponibles(8));
		Vendedor vendedorUno = new Vendedor("111111-2", "Pablo", "direccion 123");
		Bus busUno = new Bus ("azul", "DDFF44", 22);
		Tienda tiendaUno = new Tienda(vendedorUno, miniBusUno, 44);
		System.out.println(tiendaUno.existeStock());
		
		
		Cliente clienteUno = new Cliente("11111111-1", "Juan", 30);
		LibroVenta libroVenta = new LibroVenta("Venta 1", "09072021");
		libroVenta.guardarVenta(clienteUno, miniBusUno);
		Cliente clienteDos = new Cliente("22222222-2", "Maria", 35);
		LibroVenta libroVenta2 = new LibroVenta("Venta 2", "09072021");
		libroVenta2.guardarVenta(clienteDos, busUno);
	}

}
