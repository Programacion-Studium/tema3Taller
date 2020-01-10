package es.Studium.tallerTema3;

import java.util.Random;

public class Intercambio3 
{

	public static void main(String[] args) 
	{
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
		int indice_menor;
		for(i=0;i<9;i++)
		{
			indice_menor=i;
			for(j=i+1;j<10;j++)
			{
				if(array[j]<array[indice_menor])
				{
					indice_menor=j;
				}
			}
			aux=array[i];
			array[i]=array[indice_menor];
			array[indice_menor]=aux;
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
