/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;


public class ProductorConsumidor {

    public static void main(String[] args) {
       Contenedor c = new Contenedor();
       Productor p = new Productor(c,1);
       Consumidor c1 = new Consumidor(c,1);
       p.start();
       c1.start();
    }
    
}
