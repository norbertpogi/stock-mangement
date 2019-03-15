package com.pccw.crm.stockmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "RestAttr not found")
public class ResAttrNotFoundException extends RuntimeException {

}
