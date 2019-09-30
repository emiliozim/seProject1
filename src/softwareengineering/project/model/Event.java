package softwareengineering.project.model;

import java.util.ArrayList;

public class Event {
    private String name;
    private int id;
    private ArrayList<Person> contestants;
    private Person organizer;

    public Event() {}

    public Event(String name, int id, ArrayList<Person> contestants, Person organizer) {
        this.name = name;
        this.id = id;
        this.contestants = contestants;
        this.organizer = organizer;
    }


    public  int getId() {
        return id;
    }

    public Person getOrganizer() {
        return  organizer;
    }
    public String getName() {

        return "";

    }
}
