package com.lc.df.racehorse.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.df.racehorse.repository.HorseBean;
import com.lc.df.racehorse.repository.RaceHorseRepository;
import com.lc.df.racehorse.service.api.RaceHorseService;
import com.lc.df.racehorse.service.exception.RaceHorseErrorLogger;
import com.lc.df.racehorse.service.exception.RaceHorseServiceException;

import uk.co.ladbrokes.cdm.content.racingcontent._1.Breeder;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Horse;
import uk.co.ladbrokes.cdm.content.racingcontent._1.HorseTypeKind;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Jockey;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Owner;
import uk.co.ladbrokes.cdm.content.racingcontent._1.RacingForm;
import uk.co.ladbrokes.cdm.content.racingcontent._1.RunnerRating;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Trainer;
import uk.co.ladbrokes.cdm.product.sportsbook._2.Race;
import uk.co.ladbrokes.cdm.product.sportsbook._2.RaceCourse;
import uk.co.ladbrokes.services.service.commonmessage._2.ServiceError;
import uk.co.ladbrokes.services.service.commonmessage._2.ServiceStatusKind;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.ArrayOfHorse;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseRequest;
import uk.co.ladbrokes.services.service.content.racingcontent.racehorse._1.GetHorseResponse;

/**
 * @author coral
 *
 */
@Service
public class RaceHorseServiceImpl implements RaceHorseService {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RaceHorseRepository repo;
	
	@Autowired
	RaceHorseErrorLogger errorLogger;
	
	@Override
	public GetHorseResponse getHorse(GetHorseRequest request) {
		GetHorseResponse response = new GetHorseResponse();
		
		try {
			slf4jLogger.info("RaceHorseServiceImpl:getHorse()");
			String horseKey = "";
			if (null != request.getHorse()) {
				for (Horse horse : request.getHorse()) {
					horseKey = horse.getHorseKey().trim();
					break;
				}
			}
			String doc ="HORSE_"+horseKey+"_en-GB";
			slf4jLogger.info("RaceHorseServiceImpl:getHorse():doc-> "+doc);

			HorseBean bean=new HorseBean();
			
			bean = repo.findOne(doc);
			
			if(bean == null) {
				ServiceError serviceError = new ServiceError();
				errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"businessprocesser");
				response.setServiceError(serviceError);
				response.setServiceStatus(ServiceStatusKind.FAILURE);
				response.setResponseDateTime(getCurrentDate());
				return response;
			}
			
			https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse cbhorse = bean.getHorse();
			
			if(cbhorse != null) {
				response.setServiceStatus(ServiceStatusKind.SUCCESS);
				response.setResponseDateTime(getCurrentDate());
				
				ArrayOfHorse arrayOfHorse = new ArrayOfHorse();
				Horse horse = new Horse();
				
				if (null != cbhorse.getBreeder()) {
					Breeder breeder = new Breeder();
					if(null != cbhorse.getBreeder().getBreederKey()) {
						breeder.setBreederKey(cbhorse.getBreeder().getBreederKey());
					}
					if(null != cbhorse.getBreeder().getBreederName()) {
						breeder.setBreederName(cbhorse.getBreeder().getBreederName());
					}
					horse.setBreeder(breeder);
				}
				
				if (null != cbhorse.getColourDescription()) {
					horse.setColourDescription(cbhorse.getColourDescription());
				}
		
				if (null != cbhorse.getColourShortCode()) {
					horse.setColourShortCode(cbhorse.getColourShortCode());
				}
		
				if (null != cbhorse.getDiomedComment()) {
					horse.setSexShortCode(cbhorse.getDiomedComment());
				}
				
				if (null != cbhorse.getFoalDate()) {  
					XMLGregorianCalendar foalDate;
					foalDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cbhorse.getFoalDate());
					horse.setFoalDate(foalDate);
				}
				
				if (null != cbhorse.getGeldedDate()) {
					XMLGregorianCalendar geldedDate;
					geldedDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cbhorse.getFoalDate());
					horse.setGeldedDate(geldedDate);
				}
				
				if (null != cbhorse.getHorseKey()) {
					horse.setHorseKey(cbhorse.getHorseKey());
				}
		
				if (null != cbhorse.getHorseName()) {
					horse.setHorseName(cbhorse.getHorseName());
				}

				if (null != cbhorse.getHorseSuffix()) {
					horse.setHorseSuffix(cbhorse.getHorseSuffix());
				}
		
				if (null != cbhorse.getHorseType()) {
					horse.setHorseType(HorseTypeKind.fromValue(cbhorse.getHorseType()));
				}
		
				if (null != cbhorse.getSexShortCode()) {
					horse.setSexShortCode(cbhorse.getSexShortCode());
				}
		
				if (null != cbhorse.getSexDescription()) {
					horse.setSexDescription(cbhorse.getSexDescription());
				}
		
				if (null != cbhorse.getMasterFlatRating()) {
					horse.setMasterFlatRating(new BigInteger(cbhorse.getMasterFlatRating()));
				}
		
				if (null != cbhorse.getRacingPostSireComment()) {
					horse.setRacingPostSireComment(cbhorse.getRacingPostSireComment());
				}
		
				if (null != cbhorse.getRacingPostSpotlightComment()) {
					horse.setRacingPostSpotlightComment(cbhorse.getRacingPostSpotlightComment());
				}
		
				if (null != cbhorse.getRacingPOstBreedingComment()) {
					horse.setRacingPostBreedingComment(cbhorse.getRacingPOstBreedingComment());
				}
		
				if (null != cbhorse.getDiomedComment()) {
					horse.setDiomedComment(cbhorse.getDiomedComment());
				}
		
				if (null != cbhorse.getOfficialBHBRating()) {
					horse.setOfficialBHBRating(new BigInteger(cbhorse.getOfficialBHBRating()));
				}
				
				if (null != cbhorse.getOwners()) {
					Owner owner = new Owner();
					if (null != cbhorse.getOwners().getOwnerName()) {
						owner.setOwnerName(cbhorse.getOwners().getOwnerName());
					}
					horse.getOwner().add(owner);
				}
				
				if (null != cbhorse.getDamSireAvgWinDist()) {
					horse.setAverageWinDistance(cbhorse.getDamSireAvgWinDist());
				}
				
				if (null != cbhorse.getTrainers()) {
					Trainer trainer = new Trainer();
					if (null != cbhorse.getTrainers().getTrainerKey()) {
						trainer.setTrainerKey(cbhorse.getTrainers().getTrainerKey());
					}
					if (null != cbhorse.getTrainers().getTrainerName()) {
						trainer.setTrainerName(cbhorse.getTrainers().getTrainerName());
					}
					if (null != cbhorse.getTrainers().getInitials()) {
						trainer.setInitials(cbhorse.getTrainers().getInitials());
					}
					horse.getTrainer().add(trainer);
				}
				
				List<RacingForm> racingFormList = new ArrayList<>();
				for (https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse.Form form : cbhorse.getForm()) {
					RacingForm racingForm = new RacingForm();
					
					if (null != form.getWeightLbs()) {
						racingForm.setWeightLbs(new BigInteger(form.getWeightLbs()));
					}
					
					if (null != form.getTopSpeed()) {
						racingForm.setRacingPostTopSpeed(new BigInteger(form.getTopSpeed()));
					}
					
					if (null != form.getConditions()) {
						racingForm.setRaceConditions(form.getConditions());
					}
					
					if (null != form.getRaceOutcome()) {
						racingForm.setRaceOutcome(form.getRaceOutcome());
					}
					
					if (null != form.getWeight()) {
						racingForm.setWeight(form.getWeight());
					}
					
					if (null != form.getJockey()) {
						Jockey jockey = new Jockey();
						jockey.setJockeyName(form.getJockey());
						racingForm.setJockey(jockey);
					}
					
					if (null != form.getCourseKey() || null != form.getCourse() || null != form.getAbbrevcrs()) {
						RaceCourse raceCourse = new RaceCourse();
						raceCourse.setRaceCoursekey(form.getCourseKey());
						raceCourse.setCourseName(form.getCourse());
						raceCourse.setShortName(form.getAbbrevcrs());
						racingForm.setCourse(raceCourse);
					}
					
					if (null != form.getRpr() || null != form.getOfficialRating()) {
						RunnerRating runnerRating = new RunnerRating();
						if (null != form.getRpr() && form.getRpr().length() > 0) {
							runnerRating.setRatingType("Racing Post Rating");
							runnerRating.setRatingValue(new BigInteger(form.getRpr()));
						}
						if (null != form.getOfficialRating() && form.getOfficialRating().length() > 0) {
							runnerRating.setRatingType("Official Rating");
							runnerRating.setRatingValue(new BigInteger(form.getOfficialRating()));
						}
						racingForm.getRating().add(runnerRating);
					}
					
					if (null != form.getRaceKey()) {
						Race formRace = new Race();
						formRace.setRaceKey(form.getRaceKey());
						XMLGregorianCalendar result;
						result = DatatypeFactory.newInstance().newXMLGregorianCalendar(form.getDate());
						formRace.setStartTime(result);
						racingForm.setRace(formRace);
					}
					racingFormList.add(racingForm);
				}
				horse.getForm().addAll(racingFormList);
				arrayOfHorse.getHorse().add(horse);
				response.setHorses(arrayOfHorse);
				return response;
			} else {
				ServiceError serviceError = new ServiceError();
				errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"processer");
				response.setServiceError(serviceError);
				response.setServiceStatus(ServiceStatusKind.FAILURE);
				response.setResponseDateTime(getCurrentDate());
				return response;
			}
		}
		catch (DatatypeConfigurationException e) {
			ServiceError serviceError = new ServiceError();
			errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"processer");
			response.setServiceError(serviceError);
			response.setServiceStatus(ServiceStatusKind.FAILURE);
			response.setResponseDateTime(getCurrentDate());
			return response;
		}
		catch (Exception e) {
			ServiceError serviceError = new ServiceError();
			errorLogger.handleError(new RaceHorseServiceException(1,""),serviceError,"processer");
			response.setServiceError(serviceError);
			response.setServiceStatus(ServiceStatusKind.FAILURE);
			response.setResponseDateTime(getCurrentDate());
			return response;
		}
		
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
