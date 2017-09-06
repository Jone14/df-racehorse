package com.lc.df.racehorse.service.impl;


import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.lc.df.racehorse.repository.HorseBean;
import com.lc.df.racehorse.repository.RaceHorseRepository;

import https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse.Owners;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Horse;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(value = RaceHorseServiceImpl.class, secure = false)
public class RaceHorseServiceImplTest {
	
	@Mock
	RaceHorseRepository repo;
	
	@InjectMocks
	RaceHorseServiceImpl raceHorseService;
	
	
	@Test
	public void testGetHorse() throws Exception {

		String value ="881152";
		String id ="HORSE_"+value+"_en-GB";
		HorseBean horseBean =  new HorseBean();
		https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse cbhorse = new https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse();

		cbhorse.setHorseKey("881152");
		cbhorse.setHorseName("Midnight Macchiato");
		cbhorse.setHorseSuffix("IRE");
		cbhorse.setFoalDate(getCurrentDate().toString());
		cbhorse.setHorseType("Runner");
		cbhorse.setColourShortCode("Bay");
		cbhorse.setColourDescription("Bay");
		cbhorse.setSexShortCode("C");
		cbhorse.setSexDescription("colt");
		cbhorse.setMasterFlatRating("83");
		cbhorse.setRacingPostSireComment("top-class sprint 2yo, winner of the Middle Park, retired at 2, excellent young sire");
		cbhorse.setRacingPostSpotlightComment("Encouraging seventh in big-field event over straight 1m here (good to firm) on return; unable to justify favouritism in five-runner affair at Newmarket (7f, soft) three weeks later but it was still a respectable effort and possible he'll more at home back on a quicker surface.");
		cbhorse.setDiomedComment("Encouraging reappearance here C&amp;D and fair third at Newmarket since; considered");
		cbhorse.setOfficialBHBRating("86");
			Owners owner = new Owners();
			owner.setOwnerName("D A West");
		cbhorse.setOwners(owner);
		horseBean.setHorse(cbhorse);
		
		Mockito.when(repo.findOne(id)).thenReturn(horseBean);
		
		Horse horse =new Horse();
		horse.setHorseKey(value);
		List<Horse> horseList = Arrays.asList(horse);
		GetHorseRequest request= new GetHorseRequest();
		request.setHorse(horseList);
		
		GetHorseResponse bean = raceHorseService.getHorse(request);
		Assert.assertEquals(bean.getHorses().getHorse().get(0).getHorseKey(), horseBean.getHorse().getHorseKey());
		Assert.assertEquals(bean.getHorses().getHorse().get(0).getHorseName(), horseBean.getHorse().getHorseName());
		Assert.assertEquals(bean.getHorses().getHorse().get(0).getOwner().get(0).getOwnerName(), horseBean.getHorse().getOwners().getOwnerName());
		
	}
	
	/**
	 * 
	 * @return
	 */
	private XMLGregorianCalendar getCurrentDate() {
		XMLGregorianCalendar currentDate = null;
		try {
			currentDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(TimeZone.getTimeZone("UTC")));
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

		return currentDate;
	}
	
}
