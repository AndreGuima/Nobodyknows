/**
 * 
 */
package com.adpguima.nobodyknows.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Issue> saveAndListIssue(@RequestBody Issue issue) {
		return this.issueService.SaveAndListIssue(issue);
	}

}
