/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Elkin
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>();
    
    lista.add("hola");
    lista.add("que");
    lista.add("tal");
    lista.add("estas");
    lista.add("hoy");
    
    Iterator<String> it= lista.iterator();
    while(it.hasNext()) {
      
      System.out.println(it.next());
    }
    }
}
