/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena5b;

/**
 *
 * @author Carito
 */
public class Cadena5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
long hi = System.currentTimeMillis();
int n=100000;
String s="";
char c;
for(int i=0; i<n; i++)
{
c = (char)('A' + i%('Z'-'A'+1));
// concateno el caracter c utilizando el operador +
s = s + c;
}
long hf = System.currentTimeMillis();
System.out.println(s);
System.out.println((hf-hi)+" milisegundos");
    }
    
}
