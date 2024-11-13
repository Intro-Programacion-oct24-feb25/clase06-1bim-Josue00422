/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        // es para que todas la palabras son en mayusculas
        System.out.printf("%s\n", ciudad.toLowerCase());
        // s para que todas las palabras son en minusculas
        // y se impirm en minuscula ya que no le di el vaor a la ciudad
        
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // se impirme en mayuscula ya quye fue el valor que le di a ciudad
        
        // toLowerCase es un método
        // toUpperCase es un método
        
    }
}
