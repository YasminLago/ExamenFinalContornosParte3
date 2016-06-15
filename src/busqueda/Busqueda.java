package busqueda;

import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
        int valorIndice;
        String pedirIndice = JOptionPane.showInputDialog(null, "Introduce el valor del que deseas averiguar el indice: ");  
        valorIndice = Integer.parseInt(pedirIndice);
        
        int[] numeros = new int[valorIndice];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        int valor;
        String pedirValor = JOptionPane.showInputDialog(null, "Introduce el valor del que deseas averiguar el indice: ");     
        valor = Integer.parseInt(pedirValor);   
        
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, valor, 0, numeros.length - 1);
        JOptionPane.showMessageDialog(null,"El indice del valor '"+valor+"' es: " + indice);
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
