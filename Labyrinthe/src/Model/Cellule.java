package Model;

public class Cellule  
{
    private Cellule nord;
    private Cellule sud;
    private Cellule est;
    private Cellule ouest;
    private Occupant occupant;
    private boolean visitee;
    
    public Cellule()
    {
        nord = null;
        sud = null;
        est = null;
        ouest = null;
        occupant = null;
        visitee = false;
    }
    public boolean estLibre()
    {
        if(occupant == null)
            return true;
        else
            return false;
    }
    public void setVisited(); 
    public boolean getVisited();

    public static void prendreOccupant(Occupant occupant)
    {
        if(occupant != null)
        {
            this.occupant.setOccupant(occupant);
        }
    }
    @Override
    public String toString()
    {
        
    }
}
