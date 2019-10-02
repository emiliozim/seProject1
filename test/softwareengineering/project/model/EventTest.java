package softwareengineering.project.model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class EventTest {

    private Person person;
    private Event event;
    private ArrayList<Person> contestants;


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
}
