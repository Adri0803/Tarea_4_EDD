/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
    	
    	
        CCuenta objetoCuenta;
        double saldoActual;
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
            probarRetirar(objetoCuenta, 2300);
        } catch (Exception e) {
            System.err.println("Error al retirar dinero: " + e.getMessage());
        }

        try {
            probarIngresar(objetoCuenta, 600);
        } catch (Exception e) {
            System.err.println("Error al ingresar dinero: " + e.getMessage());
        }
    }

    public static void probarRetirar(CCuenta objetoCuenta, double cantidadEsperada) throws Exception {
    	objetoCuenta.retirar(cantidadEsperada);
    	System.out.println("Se retiraron " + cantidadEsperada);
    }

    public static void probarIngresar(CCuenta objetoCuenta,double cantidadEsperada) throws Exception {
    	objetoCuenta.ingresar(cantidadEsperada);
    	System.out.println("Se ingresaron " + cantidadEsperada);
    }
    
    
}