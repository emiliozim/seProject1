package softwareengineering.project.model;

public class Person {

    private String firstName;
    private String lastName;
    private int personalID;

    public Person(String firstName, String lastName, int personalID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalID = personalID;
    }

    public Person() {

    }

    public String getFirstName() {

        return firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public int getPersonalID() {

        return personalID;

    }

}
