package com.lc.df.racehorse.soap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lc.df.racehorse.service.api.RaceHorseService;
import com.lc.df.racehorse.service.exception.RaceHorseErrorLogger;
import com.lc.df.racehorse.service.exception.RaceHorseServiceException;

import uk.co.ladbrokes.services.service.commonmessage._2.ServiceError;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

@Endpoint
public class RaceHorseSoapService {
	private final Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	private static final String NAMESPACE_URI = "http://services.ladbrokes.co.uk/service/content/racingcontent/RaceHorse/1.0";
	
	@Autowired
	RaceHorseService service;
	
	@Autowired
	RaceHorseErrorLogger errorLogger;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetHorseRequest")
	@ResponsePayload
	public GetHorseResponse getHorse(@RequestPayload GetHorseRequest request) throws RaceHorseServiceException{
		slf4jLogger.info("RaceHorseSoapService:getHorse():");
		GetHorseResponse response= new GetHorseResponse();
		try{
			response = service.getHorse(request);
			if(null==response){
				ServiceError serviceError = new ServiceError();
				errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"service");
				return response;
			}
		}catch(Exception e){
			ServiceError serviceError = new ServiceError();
			errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"service");
			return response;
		}
		return response;
	}
}
