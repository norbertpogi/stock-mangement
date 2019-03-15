package com.pccw.crm.stockmanagement.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccw.crm.stockmanagement.dto.ResAttrDTO;
import com.pccw.crm.stockmanagement.exceptions.ContactNotFoundException;
import com.pccw.crm.stockmanagement.exceptions.ResAttrNotFoundException;
import com.pccw.crm.stockmanagement.model.Contact;
import com.pccw.crm.stockmanagement.model.ResAttr;
import com.pccw.crm.stockmanagement.repository.ResAttrRepository;

@Service
@Transactional(rollbackFor = Exception.class)
public class ResAttrServiceImpl implements ResAttrService {

	@Autowired
	private ResAttrRepository resAttrRepository;

	@Override
	public ResponseEntity<List<ResAttr>> getAllResAttrResponse() {
		List<ResAttr> allResAttrs = resAttrRepository.findAll();
		allResAttrs.stream().map(objA -> {
			return new ResAttr();
		}).collect(Collectors.toList());
		return new ResponseEntity<List<ResAttr>>(allResAttrs, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResAttrDTO> createNewResAttr(ResAttrDTO resDto, HttpServletRequest req) {				 
		ResAttr resAttr = new ResAttr(); 
		resAttrRepository.save(createResAttr(resAttr, resDto));		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Location", resAttrUrlHelper(resAttr, req));

		return new ResponseEntity<ResAttrDTO>(resDto, responseHeaders, HttpStatus.CREATED);
	}

	private String resAttrUrlHelper(ResAttr resAttr, HttpServletRequest req) {
		StringBuilder resourcePath = new StringBuilder();
		resourcePath.append(req.getRequestURL());
		resourcePath.append("/");
		resourcePath.append(resAttr.getId());

		return resourcePath.toString();
	}


	@Override
	public ResponseEntity<ResAttr> getResttrById(Long id) {
		ResAttr getResAttrById = findResAttrIfExists(id);

		return new ResponseEntity<ResAttr> (getResAttrById , HttpStatus.OK);
	}


	private ResAttr findResAttrIfExists(Long resAttrId) throws ResAttrNotFoundException {
		ResAttr existingRestAttr = resAttrRepository.findById(resAttrId). orElseThrow(() -> new ResAttrNotFoundException()); 
		return existingRestAttr; 
	}


	private ResAttr createResAttr(ResAttr resAttr, ResAttrDTO resDto) {		
		resAttr.setAttrName(resDto.getAttrName());
		resAttr.setAttrDesc(resDto.getAttrDesc());
		resAttr.setAttrValueType(resDto.getAttrValueType());

		if(resDto.getIsUnique().length() > 1) {
			System.out.println("value should not be exceeded to 1");
		}else {
			resAttr.setIsUnique(resDto.getIsUnique());
		}

		resAttr.setIsUnique(resDto.getIsUnique());
		resAttr.setMinCardinality(resDto.getMinCardinality());
		resAttr.setMaxCardinality(resDto.getMaxCardinality());		
		resAttr.setExtensible(resDto.getExtensible());
		resAttr.setFormula(resDto.getFormula());
		resAttr.setIsPackage(resDto.getIsPackage());
		resAttr.setAttrMaxLength(resDto.getAttrMaxLength());		
		resAttr.setEffEndDate(resDto.getEffEndDate());
		resAttr.setEffStartDate(resDto.getEffStartDate());

		return resAttr;
	}




}
