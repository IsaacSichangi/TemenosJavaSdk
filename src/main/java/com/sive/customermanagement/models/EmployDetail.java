package com.sive.customermanagement.models;

class EmployDetail {
private String employStatus;
private String occupation;
private String employJobTitle;
private String employerName;
private String employStartDate;
private String salaryCurrency;
private int salaryAmount;

// Getters and Setters
public String getEmployStatus() { return employStatus; }
public void setEmployStatus(String employStatus) { this.employStatus = employStatus; }
public String getOccupation() { return occupation; }
public void setOccupation(String occupation) { this.occupation = occupation; }
public String getEmployJobTitle() { return employJobTitle; }
public void setEmployJobTitle(String employJobTitle) { this.employJobTitle = employJobTitle; }
public String getEmployerName() { return employerName; }
public void setEmployerName(String employerName) { this.employerName = employerName; }
public String getEmployStartDate() { return employStartDate; }
public void setEmployStartDate(String employStartDate) { this.employStartDate = employStartDate; }
public String getSalaryCurrency() { return salaryCurrency; }
public void setSalaryCurrency(String salaryCurrency) { this.salaryCurrency = salaryCurrency; }
public int getSalaryAmount() { return salaryAmount; }
public void setSalaryAmount(int salaryAmount) { this.salaryAmount = salaryAmount; }
}