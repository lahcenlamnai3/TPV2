package TP1_2;
import java.util.Scanner;
public class exercice4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                   
            System.out.println("Entrez le premier entier :");
            int n = scanner.nextInt();
            
            System.out.println("Entrez le deuxième entier :");
            int m = scanner.nextInt();
            
            int sommeD_N = 0;
            int sommeD_M = 0;
            
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sommeD_N += i;
                }
            }
            
            for (int i = 2; i <= m / 2; i++) {
                if (m % i == 0) {
                    sommeD_M += i;
                }
            }
            
            if (sommeD_N == m && sommeD_M == n) {
                System.out.println(n + " et " + m + " sont des nombres amis.");
            } else {
                System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
            }
            
         
        }
    }

