package es.Studium.tallerTema3;

import java.util.Random;
import java.util.Scanner;

public class intercambio 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	// Declaro las variables
		
		int tabla[]=new int[100];//declaro tabla de 100 huecos
		int numero;
		boolean encontrado=false;
		Random aleatorio=new Random();
		Scanner teclado = new Scanner(System.in);
		//recorremos la tabla, e introducimos valores
		crearTabla(tabla, aleatorio);
		//recorro la tabla para imprimirla en pantalla
		imprimirTabla(tabla);
		ordenar(tabla);
		System.out.println("Ordenando numeros");
		imprimirTabla(tabla);
		
		System.out.println("¿Que numero quieres buscar?");
		numero=teclado.nextInt();
		
		//recorro la tabla para comprobar si el número buscado esta en la tabla
		encontrado = buscarNumero(tabla, numero, encontrado);
		//Si no se encuentra en la tabla nos dara un mensaje indicandolo
		noEncontrado(encontrado);
		teclado.close();
	}

	/**
	 * @param encontrado
	 */
	private static void noEncontrado(boolean encontrado) {
		if(!encontrado)
		{
			System.out.println("El numero NO está en la tabla");
		}
	}

	/**
	 * @param tabla
	 * @param numero
	 * @param encontrado
	 * @return
	 */
	private static boolean buscarNumero(int[] tabla, int numero, boolean encontrado) {
		int i;
		for(i=0;i<100;i++) 
		{
			if(numero==tabla[i])
			{
				System.out.println("el numero se encuentra en la posicion"+i);
				encontrado=true;
			}
		}
		return encontrado;
	}

	/**
	 * @param tabla
	 */
	private static void ordenar(int[] tabla) {
		int i;
		int j;
		int aux;
		for(i=0;i<99;i++)
		{
			for(j=i+1;j<100;j++)
			{
				if(tabla[i]>tabla[j])
				{
					aux=tabla[i];
					tabla[i]=tabla[j];
					tabla[j]=aux;
				}
			}
		}
	}

	/**
	 * @param tabla
	 */
	private static void imprimirTabla(int[] tabla) {
		int i;
		for(i=0;i<100;i++) 
		{
			System.out.println(tabla[i]);
		}
	}

	/**
	 * @param tabla
	 * @param aleatorio
	 */
	private static void crearTabla(int[] tabla, Random aleatorio) {
		int i;
		for(i=0;i<100;i++) 
		{
			tabla[i]=aleatorio.nextInt(100)+1; //creamos 100 numeros aleatorios del 1 al 100
		}
	}

}
