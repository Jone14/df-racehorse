package com.lc.df.racehorse.soap;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.lc.df.racehorse.service.api.RaceHorseService;
import com.lc.df.racehorse.service.exception.RaceHorseServiceException;

import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = RaceHorseSoapService.class)
public class RaceHorseSoapServiceTest {

	@Mock
	RaceHorseService service;
	@InjectMocks
	RaceHorseSoapService raceHorseService;
	
	@Test
	public void testGetHorse() throws Exception {
		GetHorseRequest request = new GetHorseRequest();
		GetHorseResponse response = new GetHorseResponse();

		Mockito.when(service.getHorse(request)).thenReturn(response);
		GetHorseResponse actualResponse = raceHorseService.getHorse(request);
		Assert.assertEquals(response, actualResponse);
	}
}
