package net.raisetech.restapi;

public class NameCreateRequest {
    private String givenName;
    private String familyName;

    public NameCreateRequest(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getgivenName() {
        return givenName;
    }

    public String getfamilyName() {
        return familyName;
    }
}