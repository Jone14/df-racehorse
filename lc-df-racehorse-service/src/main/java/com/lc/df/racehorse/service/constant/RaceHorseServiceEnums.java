package com.lc.df.racehorse.service.constant;

public enum RaceHorseServiceEnums {
	
	 NONE("NONE"),
	 UNSPECIFIED_TECHNICAL_ERROR("UnspecifiedTechnicalError"),
	 TCH_RCH_ERR_9999("TCH_RCH_ERR_9999"),
	 ERROR_TYPE("Technical"),
	 UNDEFINED_TECHNICAL_DESCRIPTION("Undefined technical system error."),
	 SERVICE("RaceHorse"),
	 SERVICE_VERSION("1.0"),
	 SERVICE_IDENTIFIER("http://services.ladbrokes.co.uk/service/content/racingcontent/RaceHorse/1.0"),
	 SERVICE_OPERATION("getHorse"),
	 SERVICE_OPERATION_VERSION("1.0"),
	 
	 TCH_SRV_ERR_10("TCH_SRV_ERR_10"),
	 SERVICE1("CouchBaseContentReader"),
	 SERVICE_IDENTIFIER1("http://services.ladbrokes.co.uk/service/technical/couchbase/CouchbaseContentReader/1.0"),
	 FAILED_TRANSMISSION_ERROR("FailedTransmissionError"),
	 REQUEST_TO_BACKEND_FAILED_TO_CONNECT("Request to backend failed to connect"),
	 SERVICE_OPERATION1("getContent"),
	 
	BUS_RCH_ERR_01("BUS_RCH_ERR_01"),
	ERROR_TYPE1("Business"),
	NO_DATA_FOUND("NoDataFound"),
	ERROR_DESC("No any data available against particular horse key");
	
	
		
	private String value;
	//private int id;
	
	
	RaceHorseServiceEnums() {
		
	}
	
	/**
	 * @param id
	 * @param value
	 */
	RaceHorseServiceEnums(String value){
		this.value=value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	
	@Override
	public String toString() {
		return this.value;
	}

}

