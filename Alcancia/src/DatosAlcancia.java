/**
 * Clase encargada de ejecutar los metodos que 
 * realizan las operaciones para enviarlas a la 
 * clase runner
 * @author karen
 * @version 26/02/2021
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
	
    /**Constructor 
     * @param moneda2000739 El parametro moneda2000739
     *  define la cantidad de monedas de 200 en la alcancia
     * @param moneda5000739 El parametro moneda5000739
     *  define la cantidad de monedas de 200 en la alcancia
     * @param moneda10000739 El parametro moneda10000739
     *  define la cantidad de monedas de 200 en la alcancia
     * @param rota0739 El parametro rota0739 define el esado 
     * de la alcancia
     * */
	public DatosAlcancia() {
		this.moneda2000739 = 0;
		this.moneda5000739 = 0;
		this.moneda10000739 = 0;
		this.rota0739 = false;
	}
	/** Metodos get y set*/
	/**
	 * Retorna el valor del atributo moneda2000739
	 * @return modena2000739 que es de tipo int*/
	public int getMoneda2000739() {
		return this.moneda2000739;
	}
	
	/**Modifica el valor del atributo @param moneda2000739*/
	public void setModeda2000739(int moneda2000739) {
		this.moneda2000739 = moneda2000739;
	}
	
	/**
	 * Retorna el valor del atributo moneda5000739
	 * @return modena5000739 que es de tipo int*/
	public int getMoneda5000739() {
		return (int) this.moneda5000739;
	}
	
	/**Modifica el valor del atributo @param moneda5000739*/
	public void setModeda5000739(int moneda5000739) {
		this.moneda5000739 = moneda5000739;
	}
	
	/**
	 * Rerorna el valor del atributo moneda10000739
	 * @return modena10000739 que es de tipo int*/
	public int getMoneda10000739() {
		return this.moneda10000739;
	}
	
	/**Modifica el valor del atributo @param moneda10000739*/
	public void setModeda10000739(int moneda10000739) {
		this.moneda10000739 = moneda10000739;
	}
	
	/**
	 * Retorna el estado de la alcancia
	 * @return rota0739 que es de tipo boolean*/
	public boolean isRota0739() {
		return rota0739;
	}
	/**Metodo que modifica el valor de @param rota0739*/
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
	/**
	 * Retorna una cadena de caracteres q informa la cantidad de monedas en la alcancia
	 * @return una cadena de caracteres */
	public String cantidadMonedas0739() {
		return"Monedas de 200 = " + this.moneda2000739 +
				"\n Monedas de 500 = " + this.moneda5000739 +
				"\n Monedas de 1000 = " + this.moneda10000739;
	}
	
	/**
	 * Metodo q retorne una cadena diciendo si esta rota o no
	 * @return mensaje0739 que es un string*/
	public String estadoAlcancia0739() {
		String mensaje0739 = "";  
		if(this.rota0739 == true) {
			mensaje0739 = "La alcancia esta rota";
		}else {
			mensaje0739 = "La alcancia no esta rota";
		}
		return mensaje0739;
	}
	
	 /**
	  * Calcular el dinero ahorrado en la alcancia
	  * @return TotalAhorro0739 que es un entero positivo */
	public int calcularAhorro0739() {
		int totalAhorro0739 = (200 * this.moneda2000739) + (500 * this.moneda5000739) + (1000 * this.moneda10000739);
		return totalAhorro0739;
	}
	/**Reinicia la alcancia en ceros*/
	public void nueva0739() {
	    this.moneda2000739 = 0;
	    this.moneda5000739 = 0;
	    this.moneda10000739 = 0;
	    this.rota0739 = false;
     }
	

}
