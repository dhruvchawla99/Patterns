package Patterns;
import java.util.Scanner;

public class parrallogram {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n;
	        n = s.nextInt();
	        int spaces = 1;
	        int stars =n;
	        
	        int i = 1;
	        while (i<=n){
	            int j = 1;
	            int temp = i;
	            
	            while (j<temp){
	                System.out.print(' ');
	                j++;
	            }
	            int k = 1;
	            
	            while (k<=stars){
	                System.out.print('*');
	                k++;
	            }
	            System.out.println();
	            i++;
	        }

	}

}
