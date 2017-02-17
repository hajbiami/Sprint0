package fr.univbrest.dosi.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.CREATED)
public class SPIException extends RuntimeException {
   private String msg;

public SPIException(String msg) {
	super();
	this.msg = msg;
}
   
}
