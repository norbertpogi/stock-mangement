package com.pccw.crm.stockmanagement.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.pccw.crm.stockmanagement.dto.ResAttrDTO;
import com.pccw.crm.stockmanagement.model.ResAttr;

public interface ResAttrService {
	
	public ResponseEntity <List<ResAttr>> getAllResAttrResponse();
	public ResponseEntity<ResAttrDTO> createNewResAttr (ResAttrDTO resAttrDTO, HttpServletRequest req);
	public ResponseEntity<ResAttr> getResttrById (Long id);

}
