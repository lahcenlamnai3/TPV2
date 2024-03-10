package TP1;
import java.util.Scanner;
public class exercice8 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Entrez un entier :");
	        int a = scanner.nextInt();
	        System.out.println("Entrez un autre entier :");
	        int b = scanner.nextInt();
	        int pgcd = 1;
	        for (int i = 1; i <= a && i <= b; i++) {
	            if (a % i == 0 && b % i == 0) {
	                pgcd = i;
	            }
	        }
	        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
	        
	     
	    }
	}

