package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		int [][] matrise1 = { 	{1, 3, 4},
								{7, 9, 10},
								{12, 15, 16},
								};
		for(int i=0; i<matrise1.length; i++) {
			for(int j=0; j<matrise1[i].length; j++) {

		
				System.out.print(matrise1[i][j] + " ");
			}
			System.out.println();
		}
		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		int [][] matrise1 = { {1,2,3}, {4,5,6}, {7,8,9} };
			String[][] stringMatrise = new String[matrise1.length][];
		for(int i = 0; i < matrise1.length; i++){
			stringMatrise[i] = new String[matrise1[i].length];
		    for(int j=0; j<matrise1[i].length; j++){
		    	stringMatrise[i][j] = Integer.toString(matrise1[i][j]); 
		        
		        System.out.print(stringMatrise[i][j]);
		    }
		    System.out.println("\\n"); 
		}
		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] matrise1 = { {1, 3, 4},
				  {7, 9, 10},
				  {12, 15, 16},
						};
		for(int i=0; i<matrise1.length; i++) {
			for(int j=0; j<matrise1[i].length; j++) {

		
				System.out.print(matrise1[i][j]*2 + " ");
			}
			System.out.println();
		}
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int [][] matrise1 = { 		{1, 3, 4},
									{7, 9, 10},
									{12, 15, 16},
									};
		for(int i=0; i<matrise1.length; i++) {
			for(int j=0; j<matrise1[i].length; j++); }

	int [][] matrise2 = {	{1, 3, 4},
	   			  			{7, 9, 10},
	   			  			{12, 15, 16},
							};
	for(int k=0; k<matrise1.length; k++) {
		for(int m=0; m<matrise1[k].length; m++); }



	if (erDeLik(matrise1, matrise2)) 
		System.out.println("matrise 1 og matrise2 er ikke like");
	else
		System.out.println("matrise1 og matrise2 er like");

	}
		public static boolean erDeLik(int[][] mat1, int[][] mat2) {
	if (mat1.length != mat2.length)
		return false;

	for(int i=0; i<mat1.length; i++) {
		for(int j=0; j<mat1[i].length; j++); 
	if (mat1[i] != mat2[i])
		return false;		
	
	

		return true; 
	}

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
		
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int [][] matrise1 = {	{1, 3, 4},
								{7, 9, 10},
								{12, 15, 16},
								};
		int [][] matrise2 = {	{1, 3, 4},
								{7, 9, 10},
								{12, 15, 16},
								};

int [][] sum = new int[matrise1.length][matrise2.length];
		    
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				sum[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
			sum[i][j]+=matrise1[i][k]*matrise2[k][j];      
	} 
		System.out.print(sum[i][j]+" ");  
}
		System.out.println(); 
	}    

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
