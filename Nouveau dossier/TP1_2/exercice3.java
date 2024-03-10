package TP1_2;
import java.util.Scanner;
public class exercice3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	System.out.print("Entrez un entier supérieur à 1 : ");
    int m = scanner.nextInt();
    if (estParfait(m)) {
        System.out.println(m + " est un nombre parfait.");
    } else {
        System.out.println(m+ " n'est pas un nombre parfait.");
    }
}
public static boolean estParfait(int m) {
    if (m <= 1) {
        return false;
    }
    int sommeDiviseurs = 0;
    for (int i = 1; i <= m / 2; i++) {
        if (m% i == 0) {
            sommeDiviseurs += i;
        }
    }
    return sommeDiviseurs == m;

}
}