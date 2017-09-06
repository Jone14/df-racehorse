/**
 * 
 */
package com.lc.df.racehorse.service.api;

import com.lc.df.racehorse.service.exception.RaceHorseServiceException;

import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

/**
 * @author coral
 *
 */
public interface RaceHorseService {
	
	public GetHorseResponse getHorse(GetHorseRequest request) throws RaceHorseServiceException;
	
}
