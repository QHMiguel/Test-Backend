package com.test.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.backend.entity.ArrayEntity;
import com.test.backend.service.ArrayServiceImpl;

@RestController
@RequestMapping("array")
public class ArrayController {

	@Autowired
	ArrayServiceImpl arrayService;

	@RequestMapping(value = "/counterclockwise", method = RequestMethod.POST, consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayEntity> getCounterclockwiseArray(@RequestBody ArrayEntity array) {
		ArrayEntity arrayBE = arrayService.rotateCounterclockwiseArray(array);
		return new ResponseEntity<ArrayEntity>(arrayBE,HttpStatus.OK);
	}

}
