package metodos_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[], nElementos, aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo:"));
		
		arreglo = new int [nElementos];
		
		for(int i=0; i<nElementos; i++) {
			System.out.print((i+1) + ". Digite un número: ");
			arreglo[i] = entrada.nextInt();
			
		}
		
	
		for(int i=0; i < (nElementos-1); i++ ) {
			for(int j=0; j< (nElementos-1); j++) {
				if(arreglo[j] > arreglo[j + 1]){
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j+1] = aux;
				}
			}
		}
		

		System.out.print("\nArreglo ordenado en forma creciente: ");
		for(int i=0; i<nElementos;i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.print(" ");
		

	}

}
