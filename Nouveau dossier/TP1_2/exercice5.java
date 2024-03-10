package TP1_2;
import java.util.Scanner;
public class exercice5 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	     
	        int[] buts = new int[22];
	   
	        for (int i = 0; i < 22; i++) {
	            System.out.println("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + ":");
	            buts[i] = sc.nextInt();
	        }
	        
	        int meilleurButeur = trouverMeilleurButeur(buts);
	        int totalButs = calculerTotalButs(buts);
	        int joueursSansBut = compterJoueursSansBut(buts);
	        System.out.println("Le meilleur buteur de l'équipe est n° " + (meilleurButeur + 1));
	        System.out.println("Le nombre total de buts inscrits par cette équipe est : " + totalButs);
	        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansBut);
	        
	        buts[8] += 2;
	        System.out.println("Les buts du joueur n°9 ont été mis à jour.");
	        
	    }
	    
	   public static int trouverMeilleurButeur(int[] buts) {
	        int meilleurButeur = 0;
	        for (int i = 1; i < buts.length; i++) {
	            if (buts[i] > buts[meilleurButeur]) {
	                meilleurButeur = i;
	            }
	        }
	        return meilleurButeur;
	    }
	    
	    
	    public static int calculerTotalButs(int[] buts) {
	        int totalButs = 0;
	        for (int i = 0; i < buts.length; i++) {
	            totalButs += buts[i];
	        }
	        return totalButs;
	    }
	    
	    public static int compterJoueursSansBut(int[] buts) {
	        int joueursSansBut = 0;
	        for (int i = 0; i < buts.length; i++) {
	            if (buts[i] == 0) {
	                joueursSansBut++;
	            }
	        }
	        return joueursSansBut;
	    }
	}


