package com.sive.customermanagement.models;

import java.util.List;

public class Body {
    private List<DisplayName> displayNames;
    private List<CustomerName> customerNames;
    private List<CommunicationDevice> communicationDevices;
    private List<FaxId> faxIds;
    private List<OfficePhoneNumber> officePhoneNumbers;
    private List<Street> streets;
    private List<Address> addresses;
    private List<AddressCity> addressCities;
    private List<Country> countries;
    private List<LegalDetail> legalDetails;
    private List<OtherNationalityId> otherNationalityIds;
    private List<EmployDetail> employDetails;
    private List<ResidenceDetail> residenceDetails;
    private List<RelationshipDetail> relationshipDetails;
    private List<PostingRestrictId> postingRestrictIds;
    private List<TaxId> taxIds;
    private List<ContactDetail> contactDetails;
    private List<OtherOfficer> otherOfficers;
    private int language;
    private String dateOfBirth;
    private int customerStatus;
    private String customerMnemonic;
    private String nationalityId;
    private String residenceId;
    private int accountOfficerId;
    private int industryId;
    private int target;
    private int sectorId;
    private String gender;
    private String maritalStatus;
    private String customerCompany;
    private int customerLiability;
    private int postCode;
    private String contactDate;
    private String introducer;
    private String kycRelationship;
    private boolean isKycComplete;
    private String kycLastReviewDate;
    private String kycNextSystemReviewDate;
    private String kycNextReviewDate;
    private String amlCheck;
    private String amlResult;
    private String amlLastResultDate;
    private String title;
    private String isSecureMessage;
    private String lastName;
    private String givenName;
    private String birthIncorpDate;
    private String domicile;
    private String manualRiskClass;
    private String overrideReason;
    private int numberOfDependents;
    private String dateOfDeath;
    private String taxResidenceRegion;
    private String customerType;
    private Object extensions;

    // Getters and Setters for each field
    // ... (omitted for brevity)


    public Body() {
    }

    public List<DisplayName> getDisplayNames() {
        return displayNames;
    }

    public void setDisplayNames(List<DisplayName> displayNames) {
        this.displayNames = displayNames;
    }

    public List<CustomerName> getCustomerNames() {
        return customerNames;
    }

    public void setCustomerNames(List<CustomerName> customerNames) {
        this.customerNames = customerNames;
    }

    public List<CommunicationDevice> getCommunicationDevices() {
        return communicationDevices;
    }

    public void setCommunicationDevices(List<CommunicationDevice> communicationDevices) {
        this.communicationDevices = communicationDevices;
    }

    public List<FaxId> getFaxIds() {
        return faxIds;
    }

    public void setFaxIds(List<FaxId> faxIds) {
        this.faxIds = faxIds;
    }

    public List<OfficePhoneNumber> getOfficePhoneNumbers() {
        return officePhoneNumbers;
    }

    public void setOfficePhoneNumbers(List<OfficePhoneNumber> officePhoneNumbers) {
        this.officePhoneNumbers = officePhoneNumbers;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<AddressCity> getAddressCities() {
        return addressCities;
    }

    public void setAddressCities(List<AddressCity> addressCities) {
        this.addressCities = addressCities;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<LegalDetail> getLegalDetails() {
        return legalDetails;
    }

    public void setLegalDetails(List<LegalDetail> legalDetails) {
        this.legalDetails = legalDetails;
    }

    public List<OtherNationalityId> getOtherNationalityIds() {
        return otherNationalityIds;
    }

    public void setOtherNationalityIds(List<OtherNationalityId> otherNationalityIds) {
        this.otherNationalityIds = otherNationalityIds;
    }

    public List<EmployDetail> getEmployDetails() {
        return employDetails;
    }

    public void setEmployDetails(List<EmployDetail> employDetails) {
        this.employDetails = employDetails;
    }

    public List<ResidenceDetail> getResidenceDetails() {
        return residenceDetails;
    }

    public void setResidenceDetails(List<ResidenceDetail> residenceDetails) {
        this.residenceDetails = residenceDetails;
    }

    public List<RelationshipDetail> getRelationshipDetails() {
        return relationshipDetails;
    }

    public void setRelationshipDetails(List<RelationshipDetail> relationshipDetails) {
        this.relationshipDetails = relationshipDetails;
    }

    public List<PostingRestrictId> getPostingRestrictIds() {
        return postingRestrictIds;
    }

    public void setPostingRestrictIds(List<PostingRestrictId> postingRestrictIds) {
        this.postingRestrictIds = postingRestrictIds;
    }

    public List<TaxId> getTaxIds() {
        return taxIds;
    }

    public void setTaxIds(List<TaxId> taxIds) {
        this.taxIds = taxIds;
    }

    public List<ContactDetail> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetail> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<OtherOfficer> getOtherOfficers() {
        return otherOfficers;
    }

    public void setOtherOfficers(List<OtherOfficer> otherOfficers) {
        this.otherOfficers = otherOfficers;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(int customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerMnemonic() {
        return customerMnemonic;
    }

    public void setCustomerMnemonic(String customerMnemonic) {
        this.customerMnemonic = customerMnemonic;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(String residenceId) {
        this.residenceId = residenceId;
    }

    public int getAccountOfficerId() {
        return accountOfficerId;
    }

    public void setAccountOfficerId(int accountOfficerId) {
        this.accountOfficerId = accountOfficerId;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCustomerCompany() {
        return customerCompany;
    }

    public void setCustomerCompany(String customerCompany) {
        this.customerCompany = customerCompany;
    }

    public int getCustomerLiability() {
        return customerLiability;
    }

    public void setCustomerLiability(int customerLiability) {
        this.customerLiability = customerLiability;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer;
    }

    public String getKycRelationship() {
        return kycRelationship;
    }

    public void setKycRelationship(String kycRelationship) {
        this.kycRelationship = kycRelationship;
    }

    public boolean isKycComplete() {
        return isKycComplete;
    }

    public void setKycComplete(boolean kycComplete) {
        isKycComplete = kycComplete;
    }

    public String getKycLastReviewDate() {
        return kycLastReviewDate;
    }

    public void setKycLastReviewDate(String kycLastReviewDate) {
        this.kycLastReviewDate = kycLastReviewDate;
    }

    public String getKycNextSystemReviewDate() {
        return kycNextSystemReviewDate;
    }

    public void setKycNextSystemReviewDate(String kycNextSystemReviewDate) {
        this.kycNextSystemReviewDate = kycNextSystemReviewDate;
    }

    public String getKycNextReviewDate() {
        return kycNextReviewDate;
    }

    public void setKycNextReviewDate(String kycNextReviewDate) {
        this.kycNextReviewDate = kycNextReviewDate;
    }

    public String getAmlCheck() {
        return amlCheck;
    }

    public void setAmlCheck(String amlCheck) {
        this.amlCheck = amlCheck;
    }

    public String getAmlResult() {
        return amlResult;
    }

    public void setAmlResult(String amlResult) {
        this.amlResult = amlResult;
    }

    public String getAmlLastResultDate() {
        return amlLastResultDate;
    }

    public void setAmlLastResultDate(String amlLastResultDate) {
        this.amlLastResultDate = amlLastResultDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsSecureMessage() {
        return isSecureMessage;
    }

    public void setIsSecureMessage(String isSecureMessage) {
        this.isSecureMessage = isSecureMessage;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getBirthIncorpDate() {
        return birthIncorpDate;
    }

    public void setBirthIncorpDate(String birthIncorpDate) {
        this.birthIncorpDate = birthIncorpDate;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getManualRiskClass() {
        return manualRiskClass;
    }

    public void setManualRiskClass(String manualRiskClass) {
        this.manualRiskClass = manualRiskClass;
    }

    public String getOverrideReason() {
        return overrideReason;
    }

    public void setOverrideReason(String overrideReason) {
        this.overrideReason = overrideReason;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getTaxResidenceRegion() {
        return taxResidenceRegion;
    }

    public void setTaxResidenceRegion(String taxResidenceRegion) {
        this.taxResidenceRegion = taxResidenceRegion;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Object getExtensions() {
        return extensions;
    }

    public void setExtensions(Object extensions) {
        this.extensions = extensions;
    }
}