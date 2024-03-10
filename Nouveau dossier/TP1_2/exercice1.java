package TP1_2;
import java.util.Scanner;
public class exercice1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez un entier positif : ");
	        int nbre = scanner.nextInt();
	        if (nbre <= 0) {
	            System.out.println("Veuillez entrer un entier positif.");
	            return;
	        }
	        afficherDiviseurs(nbre);

	       
	    }
	    public static void afficherDiviseurs(int nbre) {
	        int nombreDiviseurs = 0;
	        int sommeDiviseurs = 0;
	        System.out.println("Les diviseurs de " + nbre + " sont :");
	        for (int i = 1; i <= nbre; i++) {
	            if (nbre % i == 0) {
	                System.out.print(i + " ");
	                nombreDiviseurs++;
	                sommeDiviseurs += i;
	            }
	        }
	        System.out.println("Le nombre de diviseurs est : " + nombreDiviseurs);
	        System.out.println("La somme des diviseurs est : " + sommeDiviseurs);
	       

}
}