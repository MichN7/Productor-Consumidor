/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;


public class Contenedor {
    private int contenido;
    private boolean disponible = false;
    
    public synchronized int get(){
        while(disponible == false){
            try{
                wait();
            }catch(InterruptedException e){
               
            }
        }
        disponible = false;
        notifyAll();
        return contenido;
    }
    
    public synchronized void put(int valor){
        while(disponible == true){
            try{
                
                wait();
                
            }catch(InterruptedException e){
              
            }
        }
        contenido = valor;
        disponible = true;
        notifyAll();
    }

    
}
