/**
 * 
 */
package com.adpguima.nobodyknows.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.adpguima.nobodyknows.entity.Requester;
import com.adpguima.nobodyknows.repository.RequesterRepository;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Service
public class RequesterService {

	@Autowired
	RequesterRepository requesterRepository;

	public List<Requester> list() {
		return requesterRepository.findAll();
	}

	public Page<Requester> listPageable(int page, int count) {
		Pageable pages = PageRequest.of(page, count);
		return requesterRepository.findAll(pages);
	}

	public List<Requester> findByTitleIgnoreCase(String name) {
		return requesterRepository.findByNameIgnoreCase(name);
	}

	public Requester save(Requester requester) {
		return requesterRepository.save(requester);
	}

	public void delete(String id) {
		requesterRepository.deleteById(id);
	}

	public Optional<Requester> findById(String id) {
		return requesterRepository.findById(id);
	}
}
