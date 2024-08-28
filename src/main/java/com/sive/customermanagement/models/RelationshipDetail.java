package com.sive.customermanagement.models;

import java.util.List;

class RelationshipDetail {
    private int jointRelationCode;
    private int jointCustomer;
    private int reverseJointRelationCode;
    private List<RoleDetail> roleDetails;

    // Getters and Setters
    public int getJointRelationCode() { return jointRelationCode; }
    public void setJointRelationCode(int jointRelationCode) { this.jointRelationCode = jointRelationCode; }
    public int getJointCustomer() { return jointCustomer; }
    public void setJointCustomer(int jointCustomer) { this.jointCustomer = jointCustomer; }
    public int getReverseJointRelationCode() { return reverseJointRelationCode; }
    public void setReverseJointRelationCode(int reverseJointRelationCode) { this.reverseJointRelationCode = reverseJointRelationCode; }
    public List<RoleDetail> getRoleDetails() { return roleDetails; }
    public void setRoleDetails(List<RoleDetail> roleDetails) { this.roleDetails = roleDetails; }
}
