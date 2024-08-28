package com.sive.customermanagement.models;

class ContactDetail {
    private String contactType;
    private String iddPrefixPhone;
    private String contactData;

    // Getters and Setters
    public String getContactType() { return contactType; }
    public void setContactType(String contactType) { this.contactType = contactType; }
    public String getIddPrefixPhone() { return iddPrefixPhone; }
    public void setIddPrefixPhone(String iddPrefixPhone) { this.iddPrefixPhone = iddPrefixPhone; }
    public String getContactData() { return contactData; }
    public void setContactData(String contactData) { this.contactData = contactData; }
}