package Model;

public abstract class Occupant
{
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
