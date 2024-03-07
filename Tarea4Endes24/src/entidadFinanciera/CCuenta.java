/**
 * Autor: Adrián Pérez Chillarón
 */

package entidadFinanciera;

/**
 * Clase correspondiente a una cuenta bancaria de un usuario
 */

public class CCuenta {
	
	/**
	 * Devolverá el texto de que la cantidad no puede ser negativa
	 */

    public static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";
	/**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    /**
     * Variables
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * Devuelve el estado de la cuenta
     * @return saldo de l cuenta
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
    
    /**
     * A continuación todos los atributos de la clase encapsulados:
     */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public static String getErrorcantidadnegativa() {
		return ERRORCANTIDADNEGATIVA;
	}
}


    
   