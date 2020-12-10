/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonado;

/**
 *
 * @author Kevin
 */
public class Clonado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int resultadosuma;
       resultadosuma = Suma(3,10);
        System.out.println("La suma es: " + resultadosuma);
    }
    
    public static int Suma(int a, int b){
        int res;
        res = a + b;
        return res;
    }
    
}
