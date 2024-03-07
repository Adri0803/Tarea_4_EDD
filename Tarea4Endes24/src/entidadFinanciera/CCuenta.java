/**
 * @author Adrián Pérez Chillarón
 * @version 07/03/2024
 * @see Main
 */

package entidadFinanciera;

/**
 * Clase correspondiente a una cuenta bancaria de un usuario
 * @author Adrián Pérez Chillarón
 * @version 07/03/2024
 * @see Main
 */

public class CCuenta {
	
	/**
	 * Devolverá el texto de que la cantidad no puede ser negativa
	 */

    public static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";
	/**
     * Nombre de la persona titular y demás atributos declarados
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Crea una instancia de CCuenta con valores nulos o por defecto
     */
    public CCuenta()
    {
    }

 /**
  * Constructor para incializar atributos
  * @param nom nombre inicializado
  * @param cue cuenta inicializado
  * @param sal saldo inicializado
  * @param tipo No se utiliza en la construcción de ccuenta pero es el tipo de interés
  */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * Devuelve el estado de la cuenta
     * @return saldo de la cuenta
     */
    public double estado(){
        return this.saldo;
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta
     * @param cantidad dinero a ingresar
     * @throws Exception si la cantidad a ingresar es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }
    
    /**
     * Retirará dinero de la cuenta
     * @param cantidad dinero a sacar d ela cuenta
     * @throws Exception si la cantidad es negativa o no hay saldo suficiente
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    

    /** A continuación los atributos encapsulados
     * Get
     * @return Devuelve el nombre del dueño
     */
	public String getNombre() {
		return nombre;
	}

/**
 * Set
 * @param nombre se establece el nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get
	 * @return Devuelve la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}


/**
 * Set
 * @param cuenta establece la ceunta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

/**
 * Get
 * @return devuelve el saldo de la cuenta
 */
	public double getSaldo() {
		return saldo;
	}

/**
 * Set
 * @param saldo establece el saldo de la cuenta
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/**
 * Get
 * @return devuelve el tipo de interés
 */
	public double getTipoInterés() {
		return tipoInterés;
	}

/**
 * Set
 * @param tipoInterés establece el tipo de interés
 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

/**
 * Get
 * @return devuelve un error si la cantidad introducida es negativa
 */
	public static String getErrorcantidadnegativa() {
		return ERRORCANTIDADNEGATIVA;
	}
}


    
   