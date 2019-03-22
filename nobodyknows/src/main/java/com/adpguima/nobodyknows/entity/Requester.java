/**
 * 
 */
package com.adpguima.nobodyknows.entity;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Document
public class Requester {

	@Id
	private String id;
	
	@Column(name = "NAME", unique = true, nullable = false)
	@NotBlank
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Requester [id=" + id + ", name=" + name + "]";
	}
	
}
