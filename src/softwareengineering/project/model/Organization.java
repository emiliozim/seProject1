package softwareengineering.project.model;

public class Organization {

    private int orgNr;

    private String orgName;

    public Organization(int orgNr, String orgName) {
        this.orgNr = orgNr;
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

}
