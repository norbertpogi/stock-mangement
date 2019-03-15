package com.pccw.crm.stockmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pccw.crm.stockmanagement.dto.SimpleContact;
import com.pccw.crm.stockmanagement.model.Contact;
import com.pccw.crm.stockmanagement.service.ContactService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("current/")
@Api(value = "STOCK-MANAGEMENT-API", description = "inventory api use for..")
public class TestingController {

    @Autowired
    private ContactService contactService;
    
    @ApiOperation(value = "View a list of available TESTING", response = List.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })

    // List All Contacts
    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public ResponseEntity<List<Contact>> getAllContacts() throws Throwable {
        return contactService.getAllContactsResponse();
    }

    // List One Contact
    @RequestMapping(value = "contacts/{id}", method = RequestMethod.GET)
    public ResponseEntity<Contact> getSingleContact(@PathVariable Long id) throws Throwable {
        return contactService.getSingleContactResponse(id);
    }

    // Create New Contact
    @RequestMapping(value = "contacts", method = RequestMethod.POST)
    public ResponseEntity<Contact> createNewContact(@RequestBody Contact contact, HttpServletRequest req) {
        return contactService.createNewContact(contact, req);
    }

    // Update Contact with PATCH
    @RequestMapping(value = "contacts/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Contact> patchUpdateContact(@PathVariable Long id, @RequestBody Contact contact) {
        return contactService.patchUpdateContact(id, contact);
    }

    // Update Contact with PUT
    @RequestMapping(value = "contacts/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Contact> putUpdateContact(@PathVariable Long id, @RequestBody Contact contact) {
        return contactService.putUpdateContact(id, contact);
    }

    // Delete Contact
    @RequestMapping(value = "contacts/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Contact> deleteContact(@PathVariable Long id) {
        return contactService.deleteContact(id);
    }



}
