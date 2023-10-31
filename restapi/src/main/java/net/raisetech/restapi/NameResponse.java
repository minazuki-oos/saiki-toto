package net.raisetech.restapi;

public class NameResponse {
    private final String givenName;
    private final String famliyName;

    public NameResponse(String givenName, String famliyName) {
        this.givenName = givenName;
        this.famliyName = famliyName;

    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamliName() {
        return famliyName;
    }
}


