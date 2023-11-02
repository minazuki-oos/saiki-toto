package net.raisetech.restapi;

public class NameCreateRequest {
    private String givenName;
    private String familyName;

    public NameCreateRequest(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }
}