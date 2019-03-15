/**
 * 
 */
package com.adpguima.nobodyknows.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andre
 *
 */
@RestController
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getTexto() {
		return "Endpoint inicial";
	}
}
