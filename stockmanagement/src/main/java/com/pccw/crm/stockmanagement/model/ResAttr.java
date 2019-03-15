package com.pccw.crm.stockmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "res_attr")
public class ResAttr {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	
	@Column(name = "attr_name", length = 64)
	private String attrName;
	
	@Column(name = "attr_desc", length = 256)
	private String attrDesc;
	
	@Column(name = "attr_value_type", length = 16)
	private String attrValueType;
	
	@Column(name = "is_unique", length = 1)	
	private String isUnique;

	@Column(name = "min_cardinality")
	private int minCardinality;
	
	@Column(name = "max_cardinality")
	private int maxCardinality;
	
	@Column(name = "extensible", length = 1)
	private String extensible;
	
	@Column(name = "formula", length = 256)
	private String formula;
	
	@Column(name = "is_package", length = 1)
	private String isPackage;
	
	@Column(name = "override", length = 1)
	private String override;
	
	@Column(name = "attr_max_length")
	private int attrMaxLength;
	
	@Column(name = "eff_start_date", length = 16)
	private Date effStartDate;
	
	@Column(name = "eff_end_date")
	private Date effEndDate;
	
}
