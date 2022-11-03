package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int i = 1;
		while (i<=n) {
			 char p = (char)('A'+n-1);
			 
		int j = i ;
		while (j<=n) {			
			System.out.print(p);
			j++;
		 p--;
		}
			System.out.println();
			i++;		
		}	
	}

}
