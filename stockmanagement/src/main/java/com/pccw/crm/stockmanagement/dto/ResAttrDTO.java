package com.pccw.crm.stockmanagement.dto;

import java.util.Date;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ResAttrDTO {
	
	private String attrName;
	
	private String attrDesc;
	
	private String attrValueType;	

	@Size(max = 1, message = "The field max value is 1")
	private String isUnique;

	private int minCardinality;
	
	private int maxCardinality;
	
	private String extensible;
	
	private String formula;
	
	private String isPackage;
	
	private String override;
	
	private int attrMaxLength;
	
	private Date effStartDate;
	
	private Date effEndDate;

	
}
