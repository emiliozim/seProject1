package softwareengineering.project.model;

import java.util.ArrayList;

public class Event {
    private String navn;
    private int id;
    private ArrayList<Person> contestants;
    private Person organizer;

    public Event(String navn, int id, ArrayList<Person> contestants, Person ansvarlig) {
        this.navn = navn;
        this.id = id;
        this.contestants = contestants;
        this.organizer = ansvarlig;
    }

    public void addPerson (Person person){
        this.contestants.add(organizer);
    }
}
