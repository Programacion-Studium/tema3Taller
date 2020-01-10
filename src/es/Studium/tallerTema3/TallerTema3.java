package es.Studium.tallerTema3;
import java.util.Scanner;
import java.util.Random ;
public class TallerTema3 {

	public static void main(String[] args) {
		// Declaro las variables
		
		int tabla[]=new int[100];//declaro tabla de 100 huecos
		int i, numero;
		boolean encontrado=false;
		Random aleatorio=new Random();
		Scanner teclado = new Scanner(System.in);
		//recorremos la tabla, e introducimos valores
		for(i=0;i<100;i++) 
		{
			tabla[i]=aleatorio.nextInt(100)+1; //creamos 100 numeros aleatorios del 1 al 100
		}
		//recorro la tabla para imprimirla en pantalla
		for(i=0;i<100;i++) 
		{
			System.out.println(tabla[i]);
		}
		System.out.println("¿Que numero quieres buscar?");
		numero=teclado.nextInt();
		//recorro la tabla para comprobar si el número buscado esta en la tabla
		for(i=0;i<100;i++) 
		{
			if(numero==tabla[i])
			{
				System.out.println("el numero se encuentra en la posicion"+i);
				encontrado=true;
			}
		}
		//Si no se encuentra en la tabla nos dara un mensaje indicandolo
		if(!encontrado)
		{
			System.out.println("El numero NO está en la tabla");
		}
		teclado.close();
	}

}
