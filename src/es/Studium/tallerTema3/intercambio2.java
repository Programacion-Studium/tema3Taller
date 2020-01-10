package es.Studium.tallerTema3;

import java.util.Random;

public class intercambio2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array[]=new int[10];
		int i, j, aux;
		Random aleatorio=new Random();
		for (i=0;i<10;i++)
		{
			array[i]=aleatorio.nextInt(100)+1;
		}
		System.out.println("La tabla generada aleatoriamente es:");
		for(i=0;i<10;i++) 
		{
			System.out.print(array[i]+", ");
		}
		for(i=0;i<9;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(array[i]>array[j])
				{
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		System.out.println("");
		System.out.println("La tabla ordenada queda asi");
		for(i=0;i<10;i++) 
		{
			System.out.print(array[i]+", ");
		}
	}

}
