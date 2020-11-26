package Model;

public class Cellule  
{
    private Cellule nord;
    private Cellule sud;
    private Cellule est;
    private Cellule ouest;
    private Occupant occupant;
    private boolean visitee;
    

    public Cellule( Cellule nord, Cellule sud, Cellule est, Cellule ouest,Occupant occupant, boolean visitee )
    {
        this.nord=nord;
        this.sud=sud;
        this.est=est;
        this.ouest= ouest;
        this.occupant = occupant ; 

    public Cellule()
    {
        nord = null;
        sud = null;
        est = null;
        ouest = null;
        occupant = null;

        visitee = false;
    }
    public  estLibre()
    {

        if(visitee == false)
        {
         return System.out.println("la case est libre");
        }

        if(occupant == null)
            return true;
        else
            return false;

    }
   

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
