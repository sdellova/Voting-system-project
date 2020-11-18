package Controller;

import java.util.ArrayList;
import java.util.Arrays;

public class Country
{
    ArrayList<String> states = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();
    ArrayList<Voter> voters = new ArrayList<>();
    ArrayList<Official> officials = new ArrayList<>();
    
    public Country()
    {
        states.addAll(Arrays.asList("Bouches-du-Rhône", "Morbihan", "Haute-Savoie", "Ariège"));
    }
}

