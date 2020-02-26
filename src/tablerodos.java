package Oscurilandia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class tablerodos {
	public void mostrartablero1(){
	int largo=16;
	int ancho=18;
	int i;
	int p;
	
	int tablero[][] = new int[largo][ancho];{
			System.out.println("¡HOlA!, elije una posición para lanzar tu huevo");
			for (i=1;i<largo;i++) {			
				   
				if ((i==1) && (i<16)){
				
					System.out.println
					
					("    A   B   C   D   E   F   G   H   I   J   K   L   M   N   O");
    				
				}
				
				System.out.println(" ______________________________________________________________");
				
				
				for (p=1;p<ancho;p++) {				
						
						if (p==18) {
				
							System.out.print("|   |");					
						}
					
						else if((p==1) && (i<10)){
						
							System.out.print(" "+i);
						}
						
						else if((p==1) && (i>9 && i<16)){
						    System.out.print(i);
						}
						else {
						
							System.out.print(" |  ");
						}
							
					}
					
					System.out.println("");
				}
				System.out.println(" ______________________________________________________________"); 
				
	}			

	Kromi[]kromis= new Kromi[3];
		
		
		int[][]K =new int[15][15]; 
		
		for(int f = 0; f<15;f++) 
		{
			for(int j=0;j<15;j++)
			{
				K[f][j]=0; 
			}
		}
		int[][]C=new int[15][15]; 
		for(int f = 0; f<15;f++) 
		{
			for(int j=0;j<15;j++)
			{
				C[f][j]=0;
			}
		}
		
		int[][]T=new int[15][15];
		for(int f = 0; f<15;f++) 
		{
			for(int j=0;j<15;j++)
			{
				T[f][j]=0;
			}
		}
		int cont=0;
		while(cont<11) 
		{
			int f=14; 
			int c=14;
			int x=(int)(Math.random()*f);
			int y=(int)(Math.random()*c);
			if(T[x][y]==0) 
			{
			T[x][y]=1;cont++; 
			}
			
		}
		cont=0;
		while(cont<6) 
		{
			int f=14; // f=14 para limitar la posicion en donde  CAGUANO puede generarse. al ser horizontal, puede estar en cualquier linea
			int c=13;// el caguano  al ser horizontal de 2 espacios, tiene que ser limitada hasta la columna 13. 
			int y=(int)(Math.random()*f);// se genera un valor aleatorio entre 0 y 14 para y 
			int x=(int)(Math.random()*c);// se genera un valor aleatorio entre 0 y 13 para x
			if(C[x][y]==0&&T[x][y]==0&&C[x][y+1]==0&&T[x][y+1]==0) // se valida que las coordenadas se encuentren vacias
				//se asigna un 1 SOLAMENTE si se cumplen las condiciones en la cual, no existe ningun caguano  o patrullero con las mismas coordenadas
			{
			C[x][y]=1;
			C[x][y+1]=1;
			cont++;
			}

		}
		
		cont=0;
		while(cont<4) 
		
		{
			int f=12;
			int c=14;
			int x=(int)(Math.random()*f);
			int y=(int)(Math.random()*c);
			if(K[x][y]==0&&C[x][y]==0&&T[x][y]==0&&K[x+1][y]==0&&C[x+1][y]==0&&T[x+1][y]==0&&K[x+2][y]==0&&C[x+2][y]==0&&T[x+2][y]==0)
			{
			K[x][y]=1;
			K[x+1][y]=1;
			K[x+2][y]=1;
			cont++;
			}
		}
	}
}

	


	
	
	

 





