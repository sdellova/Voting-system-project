package Model;

<<<<<<< HEAD
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
=======
public abstract class Occupant
{
    protected boolean CelluleOccupé ;
>>>>>>> d8aa6e0bfc3eb9030bd2e0edd075a000219dcd1f
 // Constructeur
    public Occupant(Cellule Occupé) 
    {
<<<<<<< HEAD
        this.Occupé = Occupé; 
    }
    
    static void prendreOccupant()
    {
    cellule.prendreOccupant ; 
=======
        CelluleOccupé = false;
>>>>>>> d8aa6e0bfc3eb9030bd2e0edd075a000219dcd1f
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
