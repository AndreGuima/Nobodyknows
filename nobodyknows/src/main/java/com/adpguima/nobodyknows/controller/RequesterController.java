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

import com.adpguima.nobodyknows.entity.Requester;
import com.adpguima.nobodyknows.service.RequesterService;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@RestController
public class RequesterController {

	@Autowired
	RequesterService requesterService;

	@RequestMapping(value = "/requester", method = RequestMethod.GET)
	public List<Requester> listRequester() {
		return this.requesterService.list();
	}

	@RequestMapping(value = "/requester/{id}", method = RequestMethod.GET)
	public Optional<Requester> findByIdRequester(@PathVariable String id) {
		return this.requesterService.findById(id);
	}

	@RequestMapping(value = "/requester/{page}/{count}", method = RequestMethod.GET)
	public Page<Requester> findPageRequester(@PathVariable int page, @PathVariable int count) {
		return this.requesterService.listPageable(page, count);
	}

	@RequestMapping(value = "/requester/{name}/name", method = RequestMethod.GET)
	public List<Requester> listRequester(@PathVariable String name) {
		return this.requesterService.findByTitleIgnoreCase(name);
	}

	@RequestMapping(value = "/requester", method = RequestMethod.POST)
	public Requester saveRequester(@RequestBody Requester requester) {
		return this.requesterService.save(requester);
	}

	@RequestMapping(value = "/requester", method = RequestMethod.PUT)
	public Requester updateRequester(@RequestBody Requester requester) {
		return this.requesterService.save(requester);
	}

	@RequestMapping(value = "/requester/{id}", method = RequestMethod.DELETE)
	public void deleteRequester(@PathVariable String id) {
		this.requesterService.delete(id);
	}

}
