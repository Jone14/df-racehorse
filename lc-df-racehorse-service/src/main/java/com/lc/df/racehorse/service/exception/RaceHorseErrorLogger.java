package com.lc.df.racehorse.service.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import uk.co.ladbrokes.services.service.commonmessage._2.ErrorSeverityKind;
import uk.co.ladbrokes.services.service.commonmessage._2.ServiceError;
import uk.co.ladbrokes.services.service.commonmessage._2.ServiceErrorKind;
import static com.lc.df.racehorse.service.constant.RaceHorseServiceEnums.*;

@Component
public class RaceHorseErrorLogger {

	private final Logger slf4jLogger= Logger.getLogger(RaceHorseErrorLogger.class);
	
	final StringWriter sw = new StringWriter();
    final PrintWriter pw = new PrintWriter(sw, true);
	//private String clientTransactionId = null;
	
	/**
	 * 
	 * @param t Throwable String
	 * @param clientTransactionId
	 * @param type String
	 */
	public void handleError(Throwable t, ServiceError serviceError,String type) {
		switch (type) {
		case "service":
			createServiceError(serviceError, t);
			break;
		case "processer":
			serviceError(serviceError, t);
			break;
		case "businessprocesser":
			businessError(serviceError, t);
			break;
		}
		slf4jLogger.info(ToStringBuilder.reflectionToString(serviceError));
	}
		
		
		private void createServiceError(ServiceError serviceError,Throwable e) {
			serviceError.setErrorName(UNSPECIFIED_TECHNICAL_ERROR.toString());
			serviceError.setErrorCode(TCH_RCH_ERR_9999.toString());
			serviceError.setErrorType(ServiceErrorKind.TECHNICAL);
			serviceError.setErrorDateTime(getCurrentDate());
			serviceError.setErrorDescription(UNDEFINED_TECHNICAL_DESCRIPTION.toString());
			serviceError.setErrorSeverity(ErrorSeverityKind.ERROR);
			serviceError.setService(SERVICE.toString());
			serviceError.setServiceVersion(SERVICE_VERSION.toString());
			serviceError.setAction(NONE.toString());
			serviceError.setOperation(SERVICE_OPERATION.toString());
			serviceError.setOperationVersion(SERVICE_OPERATION_VERSION.toString());
			serviceError.setComponent(ERROR_TYPE.toString());
			//serviceError.setErrorTransactionId(clientTransactionId);
			serviceError.setStackTrace(getStackTrace(e));
		}
		
		private void businessError(ServiceError serviceError,Throwable e) {
			serviceError.setErrorName(NO_DATA_FOUND.toString());
			serviceError.setErrorCode(BUS_RCH_ERR_01.toString());
			serviceError.setErrorType(ServiceErrorKind.BUSINESS);
			serviceError.setErrorDateTime(getCurrentDate());
			serviceError.setErrorDescription(ERROR_DESC.toString());
			serviceError.setErrorSeverity(ErrorSeverityKind.ERROR);
			serviceError.setService(SERVICE1.toString());
			serviceError.setServiceVersion(SERVICE_VERSION.toString());
			serviceError.setAction(NONE.toString());
			serviceError.setOperation(SERVICE_OPERATION1.toString());
			serviceError.setOperationVersion(SERVICE_OPERATION_VERSION.toString());
			serviceError.setComponent(ERROR_TYPE.toString());
			//serviceError.setErrorTransactionId("HORSE_" +"_en-GB");
			serviceError.setStackTrace(getStackTrace(e));
		}
		private void serviceError(ServiceError serviceError,Throwable e) {
			serviceError.setErrorName(FAILED_TRANSMISSION_ERROR.toString());
			serviceError.setErrorCode(TCH_SRV_ERR_10.toString());
			serviceError.setErrorType(ServiceErrorKind.TECHNICAL);
			serviceError.setErrorDateTime(getCurrentDate());
			serviceError.setErrorDescription(REQUEST_TO_BACKEND_FAILED_TO_CONNECT.toString());
			serviceError.setErrorSeverity(ErrorSeverityKind.FATAL);
			serviceError.setService(SERVICE1.toString());
			serviceError.setServiceVersion(SERVICE_VERSION.toString());
			serviceError.setAction(NONE.toString());
			serviceError.setOperation(SERVICE_OPERATION1.toString());
			serviceError.setOperationVersion(SERVICE_OPERATION_VERSION.toString());
			serviceError.setComponent(ERROR_TYPE.toString());
			//serviceError.setErrorTransactionId(clientTransactionId);
			serviceError.setStackTrace(getStackTrace(e));
		}
		
		public String getStackTrace(final Throwable throwable) {
		     throwable.printStackTrace(pw);
		     return sw.getBuffer().toString();
		}
		
		private XMLGregorianCalendar getCurrentDate() {
			try{
				GregorianCalendar gc = new GregorianCalendar();
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			}catch(Exception e){
				slf4jLogger.info("XMLGregorianCalendar ::" +e.getMessage());
			}
			return null;
		}
	
}
