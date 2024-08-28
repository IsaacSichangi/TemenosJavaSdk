package com.sive.customermanagement.models;

public class CustomerData {
    private Header header;
    private Body body;

    public CustomerData() {
    }

    // Getters and Setters
    public Header getHeader() { return header; }
    public void setHeader(Header header) { this.header = header; }
    public Body getBody() { return body; }
    public void setBody(Body body) { this.body = body; }
}
