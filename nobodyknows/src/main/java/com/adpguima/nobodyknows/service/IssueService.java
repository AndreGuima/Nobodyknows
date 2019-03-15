/**
 * 
 */
package com.adpguima.nobodyknows.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adpguima.nobodyknows.entity.Issue;
import com.adpguima.nobodyknows.repository.IssueRepository;

/**
 * @author andre
 *
 */
@Service
public class IssueService {

	@Autowired
	IssueRepository issueRepository;

	public List<Issue> listIssue() {
		return issueRepository.findAll();
	}

	public List<Issue> SaveAndListIssue(Issue issue) {
		issueRepository.save(issue);
		return issueRepository.findAll();
	}
}
