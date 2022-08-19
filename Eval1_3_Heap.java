/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_3_Heap {
    
    public static void main(String[]args){
        //obj y obj2 guardan Referencias
        //en java las diferencias de memoria se les llama referencias, en otros lenguajes los llamamos apuntes
        int x = 10;
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }
}

class Prueba{
    public int valor=100;
    
}