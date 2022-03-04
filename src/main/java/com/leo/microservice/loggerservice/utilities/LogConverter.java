package com.leo.microservice.loggerservice.utilities;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.leo.microservice.loggerservice.dto.MessageLogDto;
import com.leo.microservice.loggerservice.entity.MessageLog;

@Component
public class LogConverter {
	
	public MessageLogDto entityToDto(MessageLog messageLog) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(messageLog, MessageLogDto.class);
	}
	
	public MessageLog dtoToEntity(MessageLogDto messageLogDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(messageLogDto, MessageLog.class);
	}

}
