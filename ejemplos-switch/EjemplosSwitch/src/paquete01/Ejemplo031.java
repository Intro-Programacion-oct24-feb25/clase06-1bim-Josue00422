/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del/a estudinate");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del/a estudinate");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la edad del estuduante");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingresa la universidad");
        System.out.println("Ingrese el nombre del/a estudinate");
        String unniversidad = entrada.nextLine();
        String inicial1 = nombre.toLowerCase();
        
                
      
        char incial1 = nombre.charAt(0); // obtener el primer caracter de una
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(inicial){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf(" %s %s con edad %d es un estudiamte de %s", 
                        nombre.toUpperCase(),apellido.toUpperCase(),edad,universidad);
                break;
            
            default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}
