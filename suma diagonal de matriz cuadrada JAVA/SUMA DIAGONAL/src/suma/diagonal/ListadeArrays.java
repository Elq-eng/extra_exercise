/*
 * clase de array
/* 
* Resumen: se cra la clase SumaCua donde se va almacenar la lista de lista es decir 
la matriz
 */
 
package suma.diagonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListadeArrays {

    //variables
        private int input, input2,input3,input4,input5,input6,input7,input8,input9;
        
        
        //declaracion de permitir la entrada de variables al sistema
        //Scanner sc = new Scanner(System.in);
        //declaracion de List
        private List<List> unificada = new ArrayList<List>();
        private List<Integer> vector = new ArrayList<Integer>();
        private List<Integer> vector1 = new ArrayList<Integer>();
        private List<Integer> vector2 = new ArrayList<Integer>();
        //instanciar valoresde la interfaz

    public ListadeArrays() {
    }    
   
    public void setInput(int input) {
        this.input = input;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public void setInput3(int input3) {
        this.input3 = input3;
    }

    public void setInput4(int input4) {
        this.input4 = input4;
    }

    public void setInput5(int input5) {
        this.input5 = input5;
    }

    public void setInput6(int input6) {
        this.input6 = input6;
    }

    public void setInput7(int input7) {
        this.input7 = input7;
    }

    public void setInput8(int input8) {
        this.input8 = input8;
    }

    public void setInput9(int input9) {
        this.input9 = input9;
    }
    
    
    public List arr()
    {
        ValoresDeTexto value = new ValoresDeTexto();
         
          vector.add(input);
         vector.add(input2);
         vector.add(input3);
         
         
        /*
        for(int i = 0; i < input; i++){
            System.out.println("ingrese el numero " + (i+1) + " del vector 1");
            input2 = Integer.parseInt(sc.nextLine());
            vector.add(input2);
        }*/
        unificada.add(0, vector);
        
        vector1.add(input4);
        vector1.add(input5);
        vector1.add(input6);
        unificada.add(1, vector1);
        
        /*for(int i = 0; i < input; i++){
            System.out.println("ingrese el numero " + (i+1) + " del vector 2");
            input2 = Integer.parseInt(sc.nextLine());
            vector1.add(input2);
        }*/
        vector2.add(input7);
        vector2.add(input8);
        vector2.add(input9);
        
        /*for(int i = 0; i < input; i++){
            System.out.println("ingrese el numero " + (i+1) + " del vector 3");
            input2 = Integer.parseInt(sc.nextLine());
            vector2.add(input2);
        }
        unificada.add(2, vector2);*/
        unificada.add(2, vector2);
        return unificada;
    }

    
    
    
    
    
    
}
