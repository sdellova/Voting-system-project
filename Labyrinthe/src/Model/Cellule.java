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
        visitee = false;
    }
    public  estLibre()
    {
        if(visitee == false)
        {
         return System.out.println("la case est libre");
        }
    }
   

    public prendreOccupant()
    {
        
    }
    @Override
    public String toString()
    {
        
    }
}
