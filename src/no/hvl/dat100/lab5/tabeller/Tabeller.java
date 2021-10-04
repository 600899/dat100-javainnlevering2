package no.hvl.dat100.lab5.tabeller;

import javax.swing.JOptionPane;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

	 	int[] tabellen = {1, 3, 4, 7, 9, 10};
    	for (int i = 0; i<6; i++) {
    	System.out.println (tabellen[i]);
    	}
    

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

	      int[] a = {42, 67, 87};
	        String str = "";
	        for (int i : a) {
	            str += i + ",";
	        }
	        str = str.substring(0, str.length() - 1);
	        System.out.println("\"[" + str + "]\"");
		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		//for løke
		int[] tabellen = {1, 3, 4, 7, 9, 10};
		int sum = 0;
		for( int i : tabellen) {
		    sum += i;
		}

		System.out.println(sum);
		//while løkke
	      int a; //tabell lengde   
	      a=6; 
	      int[] tabell2 = {1, 3, 4, 7, 9, 10};
	      int total = 0;    				  							
	      int i=0;   				    
	      while(i!=a)
	      {
	    	  total=total+tabell2[i];   			
	          i++; }   										
	        System.out.println("total:" + total);
	        
		//utivdet for løkke
	



		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		int [] tall1 = {1, 3, 4, 7, 9, 10};
		String tallsøk = JOptionPane.showInputDialog("Gi et tall");
		int ønsketTall = Integer.parseInt(tallsøk);
		int tallet = Integer.parseInt(tallsøk);
		boolean finnsTall = false;
		int k = 0;{
		while (!finnsTall && k<tall1.length) {
			if(tall1[k] == ønsketTall)
				finnsTall = true; 
			else
				k++;

		if (finnsTall) 
			JOptionPane.showMessageDialog(null, "tall et ditt" + " " + tallet + " " + "er funnet");
		
		else 
			JOptionPane.showMessageDialog(null, "tall et ditt" + " " + tallet + " " + "er ikke funnet");
		break;
		}
		}
		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int [] tall1 = {1, 3, 4, 7, 9, 10};
		System.out.println(tall1[0]);
		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
    	
    	int [] tall1 = {1, 3, 4, 7, 9, 10};
    	for(int i=0; i<tall1.length; i++);
    	
    	System.out.println("tabell tall1 reverse er:");
    for(int i=tall1.length-1; i>=0; i--) {	
    	System.out.print(tall1[i] + " ");
    }
 
		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int [] tall1 = {1, 3, 4, 7, 9, 10};
		boolean sortert=true;
		int i=1;
		while (sortert && i<tall1.length) {
			if(tall1[i-1] <= tall1[i])
				i++;
			else
				sortert = false;
			
			if (!sortert) 
			JOptionPane.showMessageDialog(null, "tabelen er ikke sortert i stigene rekkefølge");
		
			else
			JOptionPane.showMessageDialog(null, "tabelen er  sortert i stigene rekkefølge");
		break;
		}

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell3, int[] tabell4) {
		int [] tabell1 = {1, 3, 4, 7, 9, 10};
		int [] tabell2 = {5, 8, 11, 14};
		int[]tabell5 = new int[tabell1.length+tabell2.length];
		int count = 0;
      
		for(int i = 0; i < tabell1.length; i++) { 
			tabell5[i] = tabell1[i];
         count++;
      } 
      for(int k = 0; k < tabell2.length;k++) { 
    	  tabell5[count++] = tabell2[k];
      } 
      for(int i = 0;i < tabell5.length;i++) System.out.print(tabell5[i]+" ");



		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}

