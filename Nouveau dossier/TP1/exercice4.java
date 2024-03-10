package TP1;
import java.util.Scanner;
public class exercice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("donner un reel et un entier");
	      
	       float x =scanner.nextFloat();
	       int n =scanner.nextInt();
	       System.out.println("le resultat est:"+Math.pow(x, n));
}
}
