/**
 * 
 */
package com.adpguima.nobodyknows.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
		return this.issueService.list();
	}
	
	@RequestMapping(value = "/issue/{id}", method = RequestMethod.GET)
	public Optional<Issue> findByIdIssue(@PathVariable String id) {
		return this.issueService.findById(id);
	}

	@RequestMapping(value = "/issue/{page}/{count}", method = RequestMethod.GET)
	public Page<Issue> findPageIssue(@PathVariable int page, @PathVariable int count) {
		return this.issueService.listPageable(page, count);
	}
	
	@RequestMapping(value = "/issue/{title}/title", method = RequestMethod.GET)
	public List<Issue> listIssue(@PathVariable String title) {
		return this.issueService.findByTitleIgnoreCase(title);
	}

	@RequestMapping(value = "/issue", method = RequestMethod.POST)
	public Issue saveIssue(@RequestBody Issue issue) {
		return this.issueService.save(issue);
	}

	@RequestMapping(value = "/issue", method = RequestMethod.PUT)
	public Issue updateIssue(@RequestBody Issue issue) {
		return this.issueService.save(issue);
	}

	@RequestMapping(value = "/issue/{id}", method = RequestMethod.DELETE)
	public void deleteIssue(@PathVariable String id) {
		this.issueService.delete(id);
	}



}
