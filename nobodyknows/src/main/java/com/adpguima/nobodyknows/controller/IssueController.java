/**
 * 
 */
package com.adpguima.nobodyknows.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adpguima.nobodyknows.entity.Issue;
import com.adpguima.nobodyknows.service.IssueService;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@RestController
public class IssueController {

	@Autowired
	IssueService issueService;

	@RequestMapping(value = "/issue", method = RequestMethod.GET)
	public List<Issue> listIssue() {
		return this.issueService.listIssue();
	}

	@RequestMapping(value = "/issue", method = RequestMethod.POST)
	public Issue saveIssue(@RequestBody Issue issue) {
		return this.issueService.SaveIssue(issue);
	}

	@RequestMapping(value = "/issue", method = RequestMethod.PUT)
	public Issue updateIssue(@RequestBody Issue issue) {
		return this.issueService.SaveIssue(issue);
	}

	@RequestMapping(value = "/issue/{id}", method = RequestMethod.DELETE)
	public void deleteIssue(@PathVariable String id) {
		this.issueService.deleteIssue(id);
	}

	@RequestMapping(value = "/issue/{id}", method = RequestMethod.GET)
	public Optional<Issue> findByIdIssue(@PathVariable String id) {
		return this.issueService.findById(id);
	}

}
