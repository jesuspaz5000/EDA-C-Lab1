/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
import java.util.*;
/**
 *
 * @author Christian Casso
 */
public class Operadores {

    
    public static void main(String[] args) {
        System.out.println("OPERADORES JAVA");
        // suma
        int sum = 18+15;
        // resta
        int resta = 15-8;
        //multiplicacion 
        double multiplicacion = 48*0.5;
        // division
        int div = 78/4;
        // modulo
        int mod = 40%6;
        // incremento;
        sum++;
        // decremento;
        sum--;
        comparacion(sum,multiplicacion,resta,div);
    }
    public static void comparacion(int a, double b, int c, int d){
        System.out.println("Operadores de comparacion");
        // == equal to
        System.out.println(a == b);
        // != not equal
        System.out.println(a != b);
        // > greater than 
        System.out.println(a > d);
        // < less than
        System.out.println(b < c);
        // >= greater than or equal to
        System.out.println(a >= c);
        // <= less than or equal to
        System.out.println(a <= b);
    }
    
}
