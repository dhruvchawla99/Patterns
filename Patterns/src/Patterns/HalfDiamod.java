package Patterns;
import java.util.Scanner;

public class HalfDiamod {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int i = 1;
	        while(i <= n+1){
	            int j = 1;
	            while(j <= i-1){
	                System.out.print(j);
	                j++;
	            }
	            int k = j-2;
	            while(k >= 1){
	                System.out.print(k--);
	            }
	            i++;
	            System.out.println("*");
	            System.out.print("*");
	        }
	        i = 1;
	        while(i <= n){
	            int j = 1;
	            while(j <= n-i){
	                System.out.print(j++);
	            }
	            int k = j-2;
	            j = 1;
	            while(j <= n-1-i){
	                System.out.print(k--);
	                j++;
	            }
	            i++;
	            System.out.println("*");
	            System.out.print("*");
	            if(i == n)
	                break;
	        }
	    }

	}

