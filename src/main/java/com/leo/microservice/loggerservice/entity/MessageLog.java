package com.leo.microservice.loggerservice.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection ="Logs")
public class MessageLog {
	
	@Id
	private String id;
	private String message;
	
	@CreatedDate
	private Date dateCreated;
	

}
