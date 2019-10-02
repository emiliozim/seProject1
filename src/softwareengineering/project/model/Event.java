package softwareengineering.project.model;

import java.util.ArrayList;

public class Event {
    private String name;
    private int id;
    private ArrayList<Person> participantsList;
    private Person organizer;
    private TypeOfEvent typeOfEvent;
    private boolean sponsor;
    private int participantsListMin;
    private int participantsListMax;
    private ArrayList<Person> sponsorList;

    public Event(String name, int id, ArrayList<Person> participantsList, Person organizer, boolean sponsor, int participantsListMin, int participantsListMax) {
        this.name = name;
        this.id = id;
        this.participantsList = participantsList;
        this.organizer = organizer;

        this.sponsor = sponsor;
        this.participantsListMin = participantsListMin;
        this.participantsListMax = participantsListMax;
    }

    public Event() {}

    public Event(String name, int id, ArrayList<Person> participantsList, Person organizer) {
        this.name = name;
        this.id = id;
        this.participantsList = participantsList;
        this.organizer = organizer;
    }

    public void addSponsor(Person person){
        if(sponsor){
            sponsorList.add(person);
        }else{
            System.out.println("No sponsor needed");
        }
    }

    public void addParticipant(Person person){
        if(participantsListMax > participantsList.size()) {
            participantsList.add(person);
        }else{
            System.out.println("List is Full!");
        }
    }

    public void removeParticipant(Person person) {
        participantsList.remove(person);
    }

    // getters

    public  int getId() {
        return id;
    }
    public Person getOrganizer() {
        return  organizer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Person> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(ArrayList<Person> participantsList) {
        this.participantsList = participantsList;
    }

    public void setOrganizer(Person organizer) {
        this.organizer = organizer;
    }

    public TypeOfEvent getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(TypeOfEvent typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public boolean isSponsor() {
        return sponsor;
    }

    public void setSponsor(boolean sponsor) {
        this.sponsor = sponsor;
    }

    public int getParticipantsListMin() {
        return participantsListMin;
    }

    public void setParticipantsListMin(int participantsListMin) {
        this.participantsListMin = participantsListMin;
    }

    public int getParticipantsListMax() {
        return participantsListMax;
    }

    public void setParticipantsListMax(int participantsListMax) {
        this.participantsListMax = participantsListMax;
    }

    public ArrayList<Person> getSponsorList() {
        return sponsorList;
    }

    public void setSponsorList(ArrayList<Person> sponsorList) {
        this.sponsorList = sponsorList;
    }

    public ArrayList<Person> getParticipant() {
        return participantsList;
    }


}
