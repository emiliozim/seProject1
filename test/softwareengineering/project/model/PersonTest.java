package softwareengineering.project.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    private void init() {

        person = new Person();

    }

    @Test
    public void testPersonHasFirstName() {

        assertEquals(null, person.getFirstName());

    }

    @Test
    public void testPersonHasLastName() {
        assertEquals(null, person.getLastName());
    }

}


