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

public abstract class Occupant extends  Cellule {

    protected boolean CelluleOccupé ;
 // Constructeur
    public Occupant() 
    {
        
        CelluleOccupé = false;
        
        
    }

    // getters 
    @Override
    public boolean getVisited() {
        return CelluleOccupé;
    }
    // setters
    @Override
    public void setVisited() {
        CelluleOccupé= true;
    }
}
