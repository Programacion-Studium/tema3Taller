package es.Studium.tallerTema3;

import java.util.Random;

public class IntercambioBurbuja 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array[]=new int[10];
		Random aleatorio=new Random();
		generarTabla(array, aleatorio);
		System.out.println("La tabla generada aleatoriamente es:");
		mostrarTabla(array);
		ordenarTabla(array);
		System.out.println("");
		System.out.println("La tabla ordenada queda asi");
		mostrarTabla(array);
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
			for(j=0;j<10-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

	/**
	 * @param array
	 */
	private static void mostrarTabla(int[] array) {
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
