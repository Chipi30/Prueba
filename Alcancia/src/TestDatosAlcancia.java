import junit.framework.TestCase;
/**
 * Clase encargada de ejecutar los metodos que 
 * realizan la prueba del correcto funcionamiento 
 * de los metodos en la clase DatosAlcancia 
 * @author karen
 * @version 26/02/2021
 */ 
public class TestDatosAlcancia extends TestCase {

	private DatosAlcancia datosAlcancia;
	
	public void testDatosAlcancia() {
		datosAlcancia = new DatosAlcancia();
	}
	
	public void testMonedas2000739() {
		testDatosAlcancia();
		datosAlcancia.setModeda2000739(200);
		assertEquals(200, datosAlcancia.getMoneda2000739());
	}
	public void testMonedas5000739() {
		testDatosAlcancia();
		datosAlcancia.setModeda5000739(500);
		assertEquals(500, datosAlcancia.getMoneda5000739());
	}
	public void testMonedas10000739() {
		testDatosAlcancia();
		datosAlcancia.setModeda10000739(1000);
		assertEquals(1000, datosAlcancia.getMoneda10000739());
	}
	public void testRota0739() {
		testDatosAlcancia();
		datosAlcancia.setRota0739(false);
		assertFalse(datosAlcancia.isRota0739());	
	}
	public void testAgregarMoneda2000739() {
		testDatosAlcancia();
		datosAlcancia.agregarMoneda2000739();
		assertEquals(1,datosAlcancia.getMoneda2000739());
	}
	public void testAgregarMoneda5000739() {
		testDatosAlcancia();
		datosAlcancia.agregarMoneda5000739();
		assertEquals(1,datosAlcancia.getMoneda5000739());
	}
	public void testAgregarMoneda10000739() {
		testDatosAlcancia();
		datosAlcancia.agregarMoneda10000739();
		assertEquals(1,datosAlcancia.getMoneda10000739());
	}
	public void testCantidadMonedas0739() {
		testDatosAlcancia();
		datosAlcancia.cantidadMonedas0739();
		assertEquals(200,200);
		assertEquals(500,500);
		assertEquals(1000,1000);
	}
	public void testCalcularAhorro0739() {
		testDatosAlcancia();
		datosAlcancia.calcularAhorro0739();
		datosAlcancia.agregarMoneda2000739();
		datosAlcancia.agregarMoneda5000739();
		datosAlcancia.agregarMoneda10000739();
		assertEquals(1700, datosAlcancia.calcularAhorro0739());
	}
	public void testEstadoAlcancia0739() {
		testDatosAlcancia();
		datosAlcancia.estadoAlcancia0739();
		assertEquals(false, false);
	}
	
	 

}
