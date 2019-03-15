package com.pccw.crm.stockmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason = "You must include a first name")
public class ContactMissingInformationException extends RuntimeException {
}
