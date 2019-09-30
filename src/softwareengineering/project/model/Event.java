package softwareengineering.project.model;

import java.util.ArrayList;

public class Event {
    private String name;
    private int id;
    private ArrayList<Person> contestants;
    private Person organizer;

    public Event() {
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
}
