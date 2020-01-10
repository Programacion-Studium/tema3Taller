package es.Studium.tallerTema3;

import java.util.Random;
import java.util.Scanner;

public class BusquedaDicotomia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[100];
		int encontrado, elemento_buscado;
		Random aleatorio=new Random();
		generarTabla(array, aleatorio); //genera 100 numeros aleatorios del 1 al 100
		System.out.println("La tabla generada aleatoriamente es:");
		mostrarTabla(array); //muestra el contenido de la tabla
		ordenarTabla(array); //Ordena de menor a mayor el contenido de la tabla
		System.out.println("");
		System.out.println("La tabla ordenada queda asi");
		mostrarTabla(array);//muestra el contenido de la tabla, ya ordenado anteriormente
		System.out.println("");
		System.out.println("Indica el elemento a buscar");
		Scanner teclado = new Scanner(System.in);//preparamos la entrada por teclado
		elemento_buscado=teclado.nextInt();//introducimos el elemento que queremos buscar por teclado
		teclado.close();
		encontrado = buscarTabla(array, elemento_buscado); //buscamos en la tabla
		imprimirEncontrado_o_NO(encontrado); //imprimimos si se ha encontrado
	}

	
	/**
	 * @param array
	 */
	private static void ordenarTabla(int[] array) {
		int i;
		int j;
		int aux;
		for(i=0;i<(array.length-1);i++)
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
	 * @param encontrado
	 */
	private static void imprimirEncontrado_o_NO(int encontrado) {
		if(encontrado!=-1)
		{
			System.out.println("El elemento se encontró en la posición " + encontrado);
		}
		else
		{
			System.out.println("El elemento NO se ha encontrado");
		}
	}

	/**
	 * @param array
	 * @param elemento_buscado
	 * @return
	 */
	private static int buscarTabla(int[] array, int elemento_buscado) {
		int encontrado;
		int inferior;
		int superior;
		int central;
		encontrado=1;
		inferior=0;
		superior=10-1;
		while (inferior<=superior)
		{
			central=(inferior+superior)/2;
			if(array[central]==elemento_buscado)
			{
				encontrado = central;
				inferior = superior + 1;
			}
			else 
			{
				if (elemento_buscado<array[central])
				{
					superior = central-1;
				}
				else
				{
					inferior = central + 1;
				}
			}
		}
		return encontrado;
	}

	/**
	 * @param array
	 */
	private static void mostrarTabla(int[] array) {
		int i;
		for(i=0;i<array.length;i++) 
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
		for (i=0;i<array.length;i++)
		{
			array[i]=aleatorio.nextInt(100)+1;
		}
	}
}
