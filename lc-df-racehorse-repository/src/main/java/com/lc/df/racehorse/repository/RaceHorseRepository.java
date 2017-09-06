/**
 * 
 */
package com.lc.df.racehorse.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent.Horse;



/**
 * @author coral
 *
 */

public interface RaceHorseRepository extends CouchbaseRepository<HorseBean, String> {
	
	
}
