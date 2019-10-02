package softwareengineering.project.model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class EventTest {

    private Person person;
    private Person person1;
    private Person person2;
    private Person person3;
    private Event event;
    private ArrayList<Person> contestants;
    private ArrayList<Person> sponsorList;


    @Test
    public void eventHasName(){
        assertEquals("", event.getName() );

    }
    @Test
    public void testEventHasId() {

        person = new Person();
        event = new Event();
        assertEquals(0, event.getId());
    }

    @Test
    public void testHasOrganizer() {
        contestants = new ArrayList<>();
        person = new Person("emilio", "zimberlin", 2);
        event = new Event("fotball", 1, contestants, person);
        assertEquals(person, event.getOrganizer());
    }

    @Test
    public void addContester(){
        contestants = new ArrayList<>();
        person = new Person("emilio", "zimberlin", 2);
        event = new Event("fotball", 1, contestants, person);
        event.addParticipant(person);
        assertEquals(person,event.getParticipant().get(0));
    }


    @Test
    public void addContesterMax(){
        contestants = new ArrayList<>();

        person1 = new Person("nils", "nilsen", 1);
        person2 = new Person("ole", "olsen", 2);
        person2 = new Person("per", "person", 3);
        event = new Event("fotball", 1, contestants, person, false, 1, 2);
        event.addParticipant(person1);
        event.addParticipant(person2);
        event.addParticipant(person3);
        assertEquals(2,event.getParticipant().size());
    }

    @Test
    public void removeContester(){
        contestants = new ArrayList<>();
        person1 = new Person("nils", "nilsen", 1);
        person2 = new Person("ole", "olsen", 2);
        event = new Event("fotball", 1, contestants, person, false, 1, 2);
        event.addParticipant(person1);
        event.addParticipant(person2);
        event.removeParticipant(person1);
        assertEquals(person2,contestants.get(0));
    }

}
