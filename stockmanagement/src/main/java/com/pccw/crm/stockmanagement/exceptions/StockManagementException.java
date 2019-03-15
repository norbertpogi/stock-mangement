package com.pccw.crm.stockmanagement.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class StockManagementException  extends Exception {

	public static final String exceedsTheLimit = "value shoould not be greater than 1";
	
	private boolean result;
	private String errorCode;
	private String errorMsg;
	private HttpStatus httpStatus;
	
	
	
}
