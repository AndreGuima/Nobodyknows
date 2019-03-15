/**
 * 
 */
package com.adpguima.nobodyknows.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adpguima.nobodyknows.entity.Issue;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
public interface IssueRepository extends MongoRepository<Issue, String> {

}
