/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

/**
 *
 * @author Greye_000
 */
public class Consumidor extends Thread {
    private Contenedor contenedor;
    private int numero;
    
    public Consumidor(Contenedor c, int numero){
        contenedor = c;
        this.numero = numero;
    }
    
    public void run(){
        int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = contenedor.get();
            System.out.println("Consumidor n°"+ this.numero + " obtiene: " + valor );
        }
    }
    
}
