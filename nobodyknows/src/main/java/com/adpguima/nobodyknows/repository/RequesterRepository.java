/**
 * 
 */
package com.adpguima.nobodyknows.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adpguima.nobodyknows.entity.Requester;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
public interface RequesterRepository extends MongoRepository<Requester, String> {

	List<Requester> findByNameIgnoreCase(String name);

}
