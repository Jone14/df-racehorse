package com.lc.df.racehorse.repository;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Id;

import https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse;
@Document
public class HorseBean {
	@Id
	private String id;
	
	private Horse Horse;

	public Horse getHorse() {
		return Horse;
	}

	public void setHorse(Horse horse) {
		Horse = horse;
	}
	
	
}
