package busqueda;

import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {
        System.out.println("Introduce el numero de elementos del array: ");
        String elementos="";
        Scanner pedirElementos = new Scanner (System.in); 
        elementos= pedirElementos.nextLine (); 
        
        int numElementos = Integer.parseInt(elementos);
        
        int[] numeros = new int[numElementos];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        
        System.out.println("Introduce el valor del que deseas averiguar el indice: ");
        String valor="";
        Scanner pedirValor = new Scanner (System.in); 
        valor= pedirElementos.nextLine (); 
        
        int numValor = Integer.parseInt(valor);
        
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, numValor, 0, numeros.length - 1);
        System.out.println("El indice del valor '"+valor+"' es: " + indice);
       
    } 
    
    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
                
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        } 
    }
}
