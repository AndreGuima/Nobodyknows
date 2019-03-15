package com.adpguima.nobodyknows.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author André Guimarães
 *
 */
@Document
public class Step {

	@Id
	private String id;
	private String action;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Step [id=" + id + ", action=" + action + "]";
	}

}
