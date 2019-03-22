package com.adpguima.nobodyknows.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	public List<Issue> list() {
		return issueRepository.findAll();
	}

	public Page<Issue> listPageable(int page, int count) {
		Pageable pages = PageRequest.of(page, count);
		return issueRepository.findAll(pages);
	}

	public List<Issue> findByTitleIgnoreCase(String title) {
		return issueRepository.findByTitleIgnoreCase(title);
	}

	public Issue save(Issue issue) {
		return issueRepository.save(issue);
	}

	public void delete(String id) {
		issueRepository.deleteById(id);
	}

	public Optional<Issue> findById(String id) {
		return issueRepository.findById(id);
	}
}
