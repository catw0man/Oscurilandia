package Oscurilandia;

import java.util.*;
public class tablerodos {


	
		
		int Carro [];
		int huevo[];
		
		public tablerodos(int[] carro, int[] huevo) {
			super();
			Carro = carro;
			this.huevo = huevo;
		}

		public int[] getCarro() {
			return Carro;
		}

		public void setCarro(int[] carro) {
			Carro = carro;
		}

		public int[] getHuevo() {
			return huevo;
		}

		public void setHuevo(int[] huevo) {
			this.huevo = huevo;
		}

		public String toString() {
			return "Tablero [Carro=" + Arrays.toString(Carro) + ", huevo=" + Arrays.toString(huevo) + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		public int crearCarro() {
			return 0;
		}
		
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
	}	
	public void lanzarHuevo(int largoh, int anchoh, int casilla[][]) {
		
		Scanner read = new Scanner(System.in);
		int a=0;
		int letraA=0;
		int letraB=0;
		int z;
		{
			System.out.println("Elija un Casillero a lanzar Huevo Ej:'XX'");
					z = read.nextInt();
					for (int i = 0; i < z; i++){
	
					    if(i==0) {
					    	System.out.println("tu huevo se estrelló en el suelo :(");
					    }
					    if(i==1) {
						    System.out.println("le achuntaste ");
						}
					}

	
					Caguano c = new Cagunao();
					c.obtenercaguanos();
		int[][]C =new int[15][15]; 
		
		for(int f = 0; f<15;f++) 
		{
			for(int j=0;j<15;j++)
			{
				C[f][j]=0; 
			}
			}	
		
		}
		
	}
}

	


	
	
	

 





