package com.sive.customermanagement.models;

class ResidenceDetail {
    private String residenceStatus;
    private String residenceSince;
    private String residenceType;
    private int residenceValue;
    private int residenceMortgageValue;

    // Getters and Setters
    public String getResidenceStatus() { return residenceStatus; }
    public void setResidenceStatus(String residenceStatus) { this.residenceStatus = residenceStatus; }
    public String getResidenceSince() { return residenceSince; }
    public void setResidenceSince(String residenceSince) { this.residenceSince = residenceSince; }
    public String getResidenceType() { return residenceType; }
    public void setResidenceType(String residenceType) { this.residenceType = residenceType; }
    public int getResidenceValue() { return residenceValue; }
    public void setResidenceValue(int residenceValue) { this.residenceValue = residenceValue; }
    public int getResidenceMortgageValue() { return residenceMortgageValue; }
    public void setResidenceMortgageValue(int residenceMortgageValue) { this.residenceMortgageValue = residenceMortgageValue; }
}
