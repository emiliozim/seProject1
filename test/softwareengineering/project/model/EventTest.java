package softwareengineering.project.model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class EventTest {


    Event event = new Event();

    @Test
    public void eventHasName(){

        assertEquals("", event.getName() );

    }

}
