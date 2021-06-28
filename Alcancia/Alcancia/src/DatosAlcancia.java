
/**
 * Clase encargada de ejecutar los metodos que 
 * realizan las operaciones para enviarlas a la 
 * clase runner
 * @author karen
 *
 */ 

public class DatosAlcancia {
	
	/**Atributos*/
	
	/**Cantidad de monedas de 200 q tiene la alcancia*/
	private int moneda2000739;
	
	/**Cantidad de monedas de 500 q tiene la alcancia*/
    private int moneda5000739;
    
	/**Cantidad de monedas de 1000 q tiene la alcancia*/
	private int moneda10000739;
	
	/**Define si la alcancia esta rota o no*/
	private boolean rota0739;
	
    /**Constructor */
	public DatosAlcancia() {
		this.moneda2000739 = 0;
		this.moneda5000739 = 0;
		this.moneda10000739 = 0;
		this.rota0739 = false;
	}
	/** Metodos get y set*/
	/**Rerorna el valor del atributo moneda200*/
	public int getMoneda2000739() {
		return this.moneda2000739;
	}
	
	/**Modifica el valor del atributo moneda200*/
	public void setModeda2000739(int moneda2000739) {
		this.moneda2000739 = moneda2000739;
	}
	
	/**Rerorna el valor del atributo moneda500*/
	public int getMoneda5000739() {
		return (int) this.moneda5000739;
	}
	
	/**Modifica el valor del atributo moneda500*/
	public void setModeda5000739(int moneda5000739) {
		this.moneda5000739 = moneda5000739;
	}
	
	/**Rerorna el valor del atributo moneda1000*/
	public int getMoneda10000739() {
		return this.moneda10000739;
	}
	
	/**Modifica el valor del atributo moneda1000*/
	public void setModeda10000739(int moneda10000739) {
		this.moneda10000739 = moneda10000739;
	}
	
	/**retorna el estado de la alcancia*/
	public boolean isRota0739() {
		return rota0739;
	}
	
	public void setRota0739(boolean rota0739) {
		this.rota0739 = rota0739;
	}
	
	/** Agregar una moneda de 200 a la alcancia */
	public void agregarMoneda2000739() {	
		this.moneda2000739 = this.moneda2000739 + 1;
	}
	
	/** Agregar una moneda de 500 a la alcancia */
	public void agregarMoneda5000739() {	
	   this.moneda5000739 = this.moneda5000739 +1;
	}
	
	/** Agregar una moneda de 1000 a la alcancia */
	public void agregarMoneda10000739() {	
		this.moneda10000739 = this.moneda10000739 + 1;
	}
	public String cantidadMonedas0739() {
		return"Monedas de 200 = " + this.moneda2000739 +
				"\n Monedas de 500 = " + this.moneda5000739 +
				"\n Monedas de 1000 = " + this.moneda10000739;
	}
	
	/**Metodo qur retorne una cadena disiendo si esta rota o no*/
	public String estadoAlcancia0739() {
		String mensaje0739 = "";
		if(this.rota0739 == true) {
			mensaje0739 = "La alcancia esta rota";
		}else {
			mensaje0739 = "La alcancia no esta rota";
		}
		return mensaje0739;
	}
	
	 /** Calcular el dinero ahorrado en la alcancia*/
	public int calcularAhorro0739() {
		int totalAhorro0739 = (200 * this.moneda2000739) + (500 * this.moneda5000739) + (1000 * this.moneda10000739);
		return totalAhorro0739;
	}
	
	public void nueva0739() {
	    this.moneda2000739 = 0;
	    this.moneda5000739 = 0;
	    this.moneda10000739 = 0;
	    this.rota0739 = false;
     }
	
	/**En el paquete de visualizacion:
	 * creal la clase runner 
	 * metodo main
	 * crear un objeto tipo alcancia
	 * depositar 3 monedas de 200 
	 * depositar 7 monedas de 500
	 * depositar 5 monedas de 1000
	 * mostrar la cantidad de monedas de cada dnominacion
	 * mostrar el dinero ahorrado
	 * romper la alcancia 
	 * motrar el estado de la alcancia*/

}
