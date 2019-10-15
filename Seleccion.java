package metodos_ordenamiento;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Seleccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], nElementos, aux, min;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo:"));
		arreglo = new int[nElementos];
		
		System.out.println("Rellenando el arreglo: ");
		for(int i=0; i<nElementos; i++) {
			System.out.print((i+1) + ". Digite un número: ");
			arreglo[i] = entrada.nextInt();		
		}
		
		for(int i=0; i<nElementos;i++) {
			min = i;
			for(int j=i+1;j<nElementos;j++) {
				if(arreglo[j] < arreglo[min]) {
					min = j;
				}
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[min];
			arreglo[min] = aux;
		}
		
		System.out.println("\nOrden creciente: ");
		for(int i=0;i<nElementos; i++) {
			System.out.print(arreglo[i] + "-");
		}
		System.out.println("");
		
		
		
	
	}

}
