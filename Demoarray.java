/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoarray;
import java.util.Scanner;
/**
 *
 * @author Carito
 */
public class Demoarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[10];

Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese un valor (0=>fin): ");
int v = scanner.nextInt();
int i=0;

while( v!=0 && i<10 )
{

arr[i++] = v;

System.out.print("Ingrese el siguiente valor (0=>fi n): ");
v = scanner.nextInt();
}
for( int j=0; j<i; j++ )
{
System.out.println(arr[j]);
}
    }
    
}
