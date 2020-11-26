package Model;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stanislasduval
 */

public abstract class Occupant
{

    protected Cellule Occupé ;

public abstract class Occupant
{
    protected boolean CelluleOccupé ;

 // Constructeur
    public Occupant(Cellule Occupé) 
    {

        this.Occupé = Occupé; 
    }
    
    static void prendreOccupant()
    {
    cellule.prendreOccupant ; 

        CelluleOccupé = false;

    }
    // getters 
    
    public Cellule getOccupant() 
    {
        return Occupé;
    }
    // setters
    
    public Cellule setOccupant()
    {
         this.occupant =occupant; 
    }
    public abstract void toString()
    {
        
    }
}
