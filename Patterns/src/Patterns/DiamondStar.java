package Patterns;
import java.util.Scanner;
public class DiamondStar {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n;
	        n = s.nextInt();
	        int n1 = (n+1)/2;
	        int n2 = n1-1;
	        int i = 1;
	        while (i<=n1){
	            int space = 1;
	            while (space<=n1-i){
	                System.out.print(' ');
	                space++;
	            }
	            int j = 1;
	            int p = i;
	            p = p-2;
	        while (j<=p) {
	        	System.out.print('*');
	        	j++;
	        	p++;
	        }
	        i = 1;
	        while (i<=n2) {
	        	space = 1;
	        	while(space<=n2-i+1) {
	        		System.out.print(' ');
	        	}
	        j =1;
	        p = p-2;
	        while (j<=p) {
	        	System.out.print('*');
	        	p--;
	        	j++;       	
	        }
	        System.out.println();
	        i++;   
	        }
	        }
	}
}
