package com.pccw.crm.stockmanagement.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.pccw.crm.stockmanagement.dto.SimpleContact;
import com.pccw.crm.stockmanagement.model.Contact;

public interface ContactService {

    public ResponseEntity<List<Contact>> getAllContactsResponse();
    public ResponseEntity<Contact> getSingleContactResponse(Long id);
    public ResponseEntity<Contact> createNewContact(Contact contact, HttpServletRequest request);
    public ResponseEntity<Contact> patchUpdateContact(Long id, Contact contactUpdates);
    public ResponseEntity<Contact> putUpdateContact(Long id, Contact contactUpdates);
    public ResponseEntity<Contact> deleteContact(Long id);
}

