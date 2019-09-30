package softwareengineering.project.model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class EventTest {

    private Person person;
    private Event event;



    @Test
    public void viewParticipants(){




    }
    @Test
    public void testEventHasId() {

        person = new Person();
        event = new Event();
        assertEquals(0, event.getId());
    }

    @Test
    public void testHasOrganizer() {
        event = new Event();
        person = new Person();
        assertEquals(person, event.getOrganizer());
    }
}
