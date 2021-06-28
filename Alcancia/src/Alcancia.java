import javax.swing.JOptionPane;

/**
 * Clase encargada de ejecutar el programa
 * recibir y entregar datos 
 * @author karen
 * @version 26/02/2021
 */ 

public class Alcancia {
	
    /**Metodo main (metodo principal)*/
	public static void main(String[] args) {
		
		int menu0739 = -1;
		/**Objeto de la clase DatosAlcancia*/
		DatosAlcancia alcancia0739 = new DatosAlcancia();
		JOptionPane.showMessageDialog(null, "***BIENVENID@ A SU ALCANCIA***");
		while (menu0739 != 6)
		/**try catch evita q el programa termine si hay un error*/
			try {
					String elegir0739 = JOptionPane.showInputDialog(null, "-----MENÚ-----"
				              + "\n------------------------------"
				              + "\n1.) Agregar monedas"
				              + "\n2.) Numero de monedas"
				              + "\n3.) Total de la alcancia"
				              + "\n4.) Romper alcancia"
				              + "\n5.) Comenzar nueva alcancia"
				              + "\n6.) Salir"
				              + "\n Digite una opcion: ");
					      
					       menu0739 = Integer.parseInt(elegir0739);

          /** permite la ejecucuon del menu*/
			switch(menu0739) {
			case 1:
				if(alcancia0739.isRota0739() == true) {
					JOptionPane.showMessageDialog(null, "Lo sentimos pero su alcancia esta rota"
							+ "\n no puede agregar monedas");
				}else {
		    /**Agregar una moneda de una denominacion especifica */
		    String[] monedas0739 = {"$200", "$500", "$1000", "salir"};	
		    int opcion0739 = 0;
		    do {
		    	opcion0739 = JOptionPane.showOptionDialog(null, "Por favor agrege una moneda: ","Elegir monedas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, monedas0739, monedas0739[0]);
		    	if(opcion0739 == 0){
			    	JOptionPane.showMessageDialog(null, "Agrego una moneda de $200");
				    alcancia0739.agregarMoneda2000739();
				   } else if(opcion0739 == 1){
					   JOptionPane.showMessageDialog(null, "Agrego una moneda de $500");
					   alcancia0739.agregarMoneda5000739();
					 }else if(opcion0739 == 2){
						 JOptionPane.showMessageDialog(null, "Agrego una moneda de $1000");
						  alcancia0739.agregarMoneda10000739();
						}else if(opcion0739 == 3){
							
						}
		    }while(opcion0739 != 3);
			}
				break;
				
			case 2:
				if(alcancia0739.isRota0739() == true) {
					alcancia0739.nueva0739();
					JOptionPane.showMessageDialog(null,"Su alcancia esta vacia");
				}else {
					/**Codigo para saber cuantas monedas hay de cada una */
					JOptionPane.showMessageDialog(null,alcancia0739.cantidadMonedas0739());
				}
				break;
				
			case 3:
				/**Ciclo para saber cuanto dinero hay ahorrado */
				int rta0739=JOptionPane.showConfirmDialog(null,"¿Quiere saber cuanto dinero lleva ahorrado?");
		  	  if (JOptionPane.OK_OPTION == rta0739){
		  		alcancia0739.calcularAhorro0739();
			    	  JOptionPane.showMessageDialog(null, "Hay " + alcancia0739.calcularAhorro0739() + " Ahorrado en la alcancia");
			          } 
				break;
				
			case 4:
				/**Ciclo q muestra el estado de la alcancia*/
				int rota0739=JOptionPane.showConfirmDialog(null,"¿Desea romper su alcancia?");
				  if (JOptionPane.OK_OPTION == rota0739){
					alcancia0739.isRota0739();
					      alcancia0739.setRota0739(true);
				    	  JOptionPane.showMessageDialog(null,alcancia0739.estadoAlcancia0739());
				          } 
				break;
				
			case 5:
				/**Genera una nueva alcancia*/
				 int nueva0739=JOptionPane.showConfirmDialog(null,"¿Desea generar una nueva alcancia?");
	        	  if (JOptionPane.OK_OPTION == nueva0739){
	        		  alcancia0739.nueva0739();
	        		  JOptionPane.showMessageDialog(null,"Se ha generado una nueva alcancia");
	        	        }
				break;
				
			case 6:
				/**Ciclo consdicional para salir del programa*/
				int confirmar0739 = JOptionPane.showConfirmDialog(null, "Desea salir de su alcancia?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (confirmar0739 == JOptionPane.YES_OPTION ) {
					JOptionPane.showMessageDialog(null,"Gracias por usar la aplicación!!!");	
				}else if (confirmar0739 == JOptionPane.NO_OPTION){
					
				}
				break;	
			
			default:
				JOptionPane.showMessageDialog(null, "Lo sentimos pero ese numero no esta disponible "
						                          + "\ndentro de nuestras opciones");
				break;
			}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "UPS!! Valor no valido", "Error" , JOptionPane.ERROR_MESSAGE);
			
		}
	}
}
     
