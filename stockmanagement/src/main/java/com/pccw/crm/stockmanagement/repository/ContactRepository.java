package com.pccw.crm.stockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pccw.crm.stockmanagement.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>, ContactRepositoryCustom  {


}
