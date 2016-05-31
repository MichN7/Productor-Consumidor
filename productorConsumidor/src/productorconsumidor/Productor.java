/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

public class Productor extends Thread{
    private Contenedor contenedor;
    private int numero;
    
    public Productor(Contenedor c, int numero){
        contenedor = c;
        this.numero = numero;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            contenedor.put(i);
            System.out.println("Productor n° "+ this.numero + " produce: " + i);
            try{
                sleep((int)(Math.random()*100));
            }catch(InterruptedException e){
              
            }
        }
    }
    
}
