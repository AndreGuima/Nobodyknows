/**
 * 
 */
package com.adpguima.nobodyknows.service;

import java.util.List;
import java.util.Optional;

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

	public Issue SaveIssue(Issue issue) {
		return issueRepository.save(issue);
	}

	public void deleteIssue(String id) {
		issueRepository.deleteById(id);
	}

	public Optional<Issue> findById(String id) {
		return issueRepository.findById(id);
	}
}
