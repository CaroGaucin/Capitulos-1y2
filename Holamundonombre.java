/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundonombre;
import java.util.Scanner;
/**
 *
 * @author Carito
 */
public class Holamundonombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // esta clase permite leer datos por teclado
Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese su nombre: ");

String nom = scanner.nextLine();

System.out.println("Hola Mundo: " + nom);
    }
    
}
