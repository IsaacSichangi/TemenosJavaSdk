package com.sive.customermanagement.models;

class CommunicationDevice {
    private String phoneNumber;
    private String smsNumber;
    private String email;
    private String communicationType;
    private String preferredChannel;

    // Getters and Setters
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getSmsNumber() { return smsNumber; }
    public void setSmsNumber(String smsNumber) { this.smsNumber = smsNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCommunicationType() { return communicationType; }
    public void setCommunicationType(String communicationType) { this.communicationType = communicationType; }
    public String getPreferredChannel() { return preferredChannel; }
    public void setPreferredChannel(String preferredChannel) { this.preferredChannel = preferredChannel; }
}