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
 // Constructeur
    public Occupant(Cellule Occupé) 
    {
        this.Occupé = Occupé; 
    }
    
    static void prendreOccupant()
    {
    cellule.prendreOccupant ; 
    }
    // getters 
    
    public Cellule getOccupant() 
    {
        return Occupé;
    }
    // setters
    
    public Cellule setOccupant()
    {
         
    }
    public abstract void toString()
    {
        
    }
}
