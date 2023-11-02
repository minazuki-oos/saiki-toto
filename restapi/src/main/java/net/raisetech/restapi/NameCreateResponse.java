package net.raisetech.restapi;

public class NameCreateResponse {
    private final String message;

    public NameCreateResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
