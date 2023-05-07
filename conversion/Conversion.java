/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;
import java.util.*;
/**
 *
 * @author Christian Casso
 */
public class Conversion {

//Ensanchamiento de fundicion
    public static void main(String[] args) {
        System.out.println("CONVERSIÓN DE TIPOS DE JAVA");
        int mi_entero= 15;
        double myDouble= mi_entero; // automatic casting: int to double
        
        System.out.println(mi_entero); //15
        System.out.println(myDouble); // 15.0
        casting();
    }
//fundicion de ensanchamiento
    public  static void casting(){
    double myDouble = 15615.47d;
    int myInt = (int)myDouble; // Manual casting: double to int
    
    System.out.println(myDouble);// 15615.47
    System.out.println(myInt);//15615
}
}
