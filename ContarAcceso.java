package beans;

import java.io.Serializable;

public class ContarAcceso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	/*
	 * Propiedad de la clase que nos va a permitir acumular las veces que se accede a la aplicacion
	 */
	private int accesos = 0;
	
	/*
	 * Constructor sin parametro de la clase
	 * 
	 */
	public ContarAcceso(){
		
	}
	
	/*
	 * Metodo get que nos devuelve el valor de la propiedad accesos
	 * 
	 */
	public int getAccesos() {
		return accesos;
	}
	
	/*
	 * Metodo set que modifica el valor de la propiedad acceso
	 */
	public void setAccesos(int acceso) {
		this.accesos = acceso;
	}
	
	/*
	 * Metodo que suma un acceso a la propiedad acceso
	 */
	public int getSumaAcceso(){
		this.accesos++;
		return accesos;
	}
}
