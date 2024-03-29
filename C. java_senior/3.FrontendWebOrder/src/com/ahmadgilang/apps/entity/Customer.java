/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadgilang.apps.entity;

import java.io.Serializable;

/**
 *
 * @author Gilang
 */
public class Customer implements Serializable{

/**
 * 
 */
private static final long serialVersionUID = -1445721631941797951L;
private String _id;
private String companyName;
private String firstName;
private String lastName;
private String billingAddress;
private String city;
private String stateOrProvince;
private String zipCode;
private String email;
private String companyWebsite;
private String phoneNumber;
private String faxNumber;
private String shipAddress;
private String shipCity;
private String shipStateOrProvince;
private String shipZipCode;
private String shipPhoneNumber;

public Customer() {
        super();
        // TODO Auto-generated constructor stub
}

public String get_id() {
        return _id;
}

public void set_id(String _id) {
        this._id = _id;
}

public String getCompanyName() {
        return companyName;
}

public void setCompanyName(String companyName) {
        this.companyName = companyName;
}

public String getFirstName() {
        return firstName;
}

public void setFirstName(String firstName) {
        this.firstName = firstName;
}

public String getLastName() {
        return lastName;
}

public void setLastName(String lastName) {
        this.lastName = lastName;
}

public String getBillingAddress() {
        return billingAddress;
}

public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
}

public String getCity() {
        return city;
}

public void setCity(String city) {
        this.city = city;
}

public String getStateOrProvince() {
        return stateOrProvince;
}

public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
}

public String getZipCode() {
        return zipCode;
}

public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
}

public String getEmail() {
        return email;
}

public void setEmail(String email) {
        this.email = email;
}

public String getCompanyWebsite() {
        return companyWebsite;
}

public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
}

public String getPhoneNumber() {
        return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
}

public String getFaxNumber() {
        return faxNumber;
}

public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
}

public String getShipAddress() {
        return shipAddress;
}

public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
}

public String getShipCity() {
        return shipCity;
}

public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
}

public String getShipStateOrProvince() {
        return shipStateOrProvince;
}

public void setShipStateOrProvince(String shipStateOrProvince) {
        this.shipStateOrProvince = shipStateOrProvince;
}

public String getShipZipCode() {
        return shipZipCode;
}

public void setShipZipCode(String shipZipCode) {
        this.shipZipCode = shipZipCode;
}

public String getShipPhoneNumber() {
        return shipPhoneNumber;
}

public void setShipPhoneNumber(String shipPhoneNumber) {
        this.shipPhoneNumber = shipPhoneNumber;
}
    
}
