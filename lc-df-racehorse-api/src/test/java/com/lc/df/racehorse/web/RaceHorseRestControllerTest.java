package com.lc.df.racehorse.web;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.lc.df.racehorse.service.api.RaceHorseService;

import uk.co.ladbrokes.cdm.content.racingcontent._1.Horse;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.ArrayOfHorse;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(value = RaceHorseController.class, secure = false)
public class RaceHorseRestControllerTest {

	@InjectMocks
	RaceHorseController raceHorseController;
	@Mock
	RaceHorseService service;
	

	@Test
	public void testGetHorse() throws Exception {
		
		String value ="881152";
		
		GetHorseRequest request = new GetHorseRequest();
		List<Horse> horse= new ArrayList<Horse>();
		Horse horseobj = new Horse();
		horseobj.setHorseKey(value);
		horse.add(horseobj);
		request.getHorse().addAll(horse);
		
		GetHorseResponse response = new GetHorseResponse();
		ArrayOfHorse arrayOfHorse = new ArrayOfHorse();
		List<Horse> responseListHorse = new ArrayList<Horse>();
		Horse responseHorse = new Horse();
		responseHorse.setHorseKey(value);
		responseListHorse.add(responseHorse);
		arrayOfHorse.getHorse().addAll(responseListHorse);
		response.setHorses(arrayOfHorse);
					
		
		Mockito.when(service.getHorse(request)).thenReturn(response);
		GetHorseResponse getHorseResponse = raceHorseController.getHorse(request);
		Assert.assertEquals(response, getHorseResponse);
		
	}
}
