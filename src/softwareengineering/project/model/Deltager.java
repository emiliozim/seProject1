package softwareengineering.project.model;

public class Deltager extends Person{

    private String deltagerNummer;

    public Deltager(String fornavn, String etternavn, int fodselnummer, String deltagerNummer) {
        super(fornavn, etternavn, fodselnummer);
        this.deltagerNummer = deltagerNummer;
    }
}
