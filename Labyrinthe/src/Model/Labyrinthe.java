package Model;

import java.util.Random;
import java.util.ArrayList;

public class Labyrinthe
{
    private ArrayList<ArrayList<Cellule>> matriceCellules;
    private Explorateur explorateur;
    private int hauteur;
    private int largeur;
    private Coordonnees coordonneesDepart;
    private Coordonnees coordonneesArrivee;
    private Coordonnees coordonneesCourantes;
    
    public Labyrinthe()
    {
        Random random1 = new Random();
        hauteur = 5 + random1.nextInt(5);
        Random random2 = new Random();
        largeur = 5 + random2.nextInt(5);
        explorateur.coordonneesCourantes = coordonneesDepart;
        explorateur = new Explorateur();
    }
    public void deplacerAlea()
    {
        Random random = new Random();
        int nb = 1 + random.nextInt(3);
        switch(nb)
        {
            case 1 :
                explorateur.deplacerVers("nord");
                break;
            case 2 :
                explorateur.deplacerVers("sud");
                break;
            case 3 :
                explorateur.deplacerVers("est");
                break;
            case 4 :
                explorateur.deplacerVers("ouest");
                break;                
        }
        
    }
}
