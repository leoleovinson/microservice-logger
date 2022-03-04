package com.leo.microservice.loggerservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leo.microservice.loggerservice.entity.MessageLog;

@Repository
public interface MessageLogRepository extends MongoRepository<MessageLog, String> {

}
