package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombre d'articles total : ");
        int nbrArticles = clavier.nextInt();
        int som = 0;

        for(int i = 1; i <= nbrArticles; i++) {
            System.out.print("prix de l'article " + i + " : ");
            int prixArticle = clavier.nextInt();
            som = som + prixArticle;
        }

        System.out.print("Votre total est de : " + som);
        clavier.close();
    }
    
}
