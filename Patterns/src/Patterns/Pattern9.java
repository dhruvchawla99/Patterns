package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int i = 1;
		while (i<=n) {
			 char p = (char)('A'+i-1);
			 
		int j = 1 ;
		while (j<=i) {			
			System.out.print(p);
			j++;
		 p++;
		}
			System.out.println();
			i++;		
		}	
	}

}
