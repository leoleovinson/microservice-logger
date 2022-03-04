package com.leo.microservice.loggerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.microservice.loggerservice.dto.MessageLogDto;
import com.leo.microservice.loggerservice.service.LogService;

@RestController
public class MessageLogController {
	
	@Autowired
	LogService logService;
	
	@GetMapping("/logs")
	public ResponseEntity<List<MessageLogDto>> getAllLogs(){
		
		return new ResponseEntity<>(logService.getAllLogsDto(),HttpStatus.OK);
		
	}

}
