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

import com.pccw.crm.stockmanagement.dto.ResAttrDTO;
import com.pccw.crm.stockmanagement.model.ResAttr;
import com.pccw.crm.stockmanagement.service.ResAttrService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("current/")
@Api(value = "STOCK-MANAGEMENT-API", description = "inventory api use for..")
public class ResAttrbsController {

	@Autowired
	private ResAttrService resAttrService;

	@ApiOperation(value = "Find all instances of the model matched by filter from the data source", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})


	//create new resattr
	@RequestMapping(value = "ResAttrs", method = RequestMethod.POST)
	public ResponseEntity<ResAttrDTO> createNewResAttr(@RequestBody ResAttrDTO resAttrDTO,HttpServletRequest req) {
		return resAttrService.createNewResAttr(resAttrDTO, req);
	}

	//get all ResAttr
	@RequestMapping(value = "/ResAttrs", method = RequestMethod.GET)
	public ResponseEntity <List<ResAttr>> getAllResAttrs() throws Throwable {
		return resAttrService.getAllResAttrResponse();
	}
	
	//get One RestATtrById
	@RequestMapping(value = "/ResAttrs/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResAttr> getResttrById(@PathVariable Long id) throws Throwable  {
		return resAttrService.getResttrById(id);
	}



}













