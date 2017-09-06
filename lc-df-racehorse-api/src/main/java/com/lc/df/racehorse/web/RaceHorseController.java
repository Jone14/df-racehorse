package com.lc.df.racehorse.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lc.df.racehorse.service.api.RaceHorseService;
import com.lc.df.racehorse.service.exception.RaceHorseErrorLogger;
import com.lc.df.racehorse.service.exception.RaceHorseServiceException;

import uk.co.ladbrokes.services.service.commonmessage._2.ServiceError;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

/**
 * @author coral
 *
 */
@RestController
@RequestMapping(value="RacingContent")
public class RaceHorseController {
	
	@Autowired
	RaceHorseErrorLogger errorLogger;
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	ServiceError serviceError = new ServiceError();

	@Autowired
	private RaceHorseService service;
	
	@RequestMapping(value="getHorse",method=RequestMethod.POST)
	public @ResponseBody GetHorseResponse getHorse(@RequestBody GetHorseRequest request) throws Exception {
		slf4jLogger.info("RaceHorseController:getHorse:");
		GetHorseResponse response= null;
		try{
			response = service.getHorse(request);
			if(response == null){
				ServiceError serviceError = new ServiceError();
				errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"service");
				response = new GetHorseResponse();
				response.setServiceError(serviceError);
				return response;
			}
		}catch(Exception exp){
			ServiceError serviceError = new ServiceError();
			errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"service");
			response = new GetHorseResponse();
			response.setServiceError(serviceError);
			return response;
		}
		return response;
	}
}
