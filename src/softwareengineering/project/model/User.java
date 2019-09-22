package softwareengineering.project.model;

public class User {

    private int userID = 0;

    private String firstName, surName, userName;

    private Organization organization;


    public User(int userID, String firstName, String surName, String userName, Organization organization) {
        this.userID = userID;
        this.firstName = firstName;
        this.surName = surName;
        this.userName = userName;
        this.organization = organization;
    }

    public void logIn(String userName, String userPass) {

    }

    public void logOut(String userName, String userPass){

    }

    public String getUserName() {
        return userName;
    }

    public Organization getOrganization() {
        return organization;
    }
}
