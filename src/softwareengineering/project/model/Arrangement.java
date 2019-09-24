package softwareengineering.project.model;

import java.util.ArrayList;

public class Arrangement {
    private String navn;
    private int id;
    private ArrayList<Deltager> deltagerListe;
    private Person ansvarlig;

    public Arrangement(String navn, int id, ArrayList<Deltager> deltagerListe, Person ansvarlig) {
        this.navn = navn;
        this.id = id;
        this.deltagerListe = deltagerListe;
        this.ansvarlig = ansvarlig;
    }
}
