package com.pccw.crm.stockmanagement.dto;

import com.pccw.crm.stockmanagement.model.Contact;

public class SimpleContact {

    private Long id;
    private String firstName;

    public SimpleContact() { }

    public SimpleContact(Contact contact) {
        this.id = contact.getId();
        this.firstName = contact.getFirstName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
