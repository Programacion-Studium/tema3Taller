package es.Studium.tallerTema3;

import java.util.Random;

public class Intercambio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		Random aleatorio=new Random();
		generarTabla(array, aleatorio);
		System.out.println("La tabla generada aleatoriamente es:");
		imprimirTabla(array);
		ordenarTabla(array);
		System.out.println("");
		System.out.println("La tabla ordenada queda asi");
		imprimirTabla(array);
	}

	/**
	 * @param array
	 */
	private static void ordenarTabla(int[] array) {
		int i;
		int j;
		int aux;
		for(i=0;i<9;i++)
		{
			j=i;
			aux=array[i];
			while ((j>0)&&(aux<array[j-1]))
			{
				array[j]=array[j-1];
				j=j-1;
			}
			array[j]=aux;
		}
	}

	/**
	 * @param array
	 */
	private static void imprimirTabla(int[] array) {
		int i;
		for(i=0;i<10;i++) 
		{
			System.out.print(array[i]+", ");
		}
	}

	/**
	 * @param array
	 * @param aleatorio
	 */
	private static void generarTabla(int[] array, Random aleatorio) {
		int i;
		for (i=0;i<10;i++)
		{
			array[i]=aleatorio.nextInt(100)+1;
		}
	}

}
