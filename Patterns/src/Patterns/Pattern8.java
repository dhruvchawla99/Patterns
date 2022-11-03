package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int i = 1;
		while (i<=n) {
		int j = 1 ;
		while (j<=i) {
			char jthChar = (char)('A'+ j -1);
			
			System.out.print(jthChar);
			j++;
		}
			System.out.println();
			i++;		
		}	


	}

}
