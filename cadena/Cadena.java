
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadena;

/**
 *
 * @author Christian
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("JAVA STRINGS");
        String txt = "HELLO wordl";
        System.out.println(txt);// el texto
        System.out.println("CANTIDAD DE LENTRAS: "+txt.length());//cantidad de letras del texto
        System.out.println(txt.toUpperCase());//para poner en mayuscula
        System.out.println(txt.toLowerCase());//para poner en minuscula
        System.out.println(txt.indexOf("wordl"));// devuelve la posicion
    }
    
}
