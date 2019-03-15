package com.adpguima.nobodyknows.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author André Guimarães
 *
 */
@Document
public class Issue {

	@Id
	private String id;
	private String description;
	private Person requester;
	private Person client;
	private Person influencer;
	private List<Person> helpers;
	private List<Step> steps;
	private Cause cause;
	private Solution solution;
	private Date creationDate;
	private Date startDate;
	private Date finishDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Person getRequester() {
		return requester;
	}

	public void setRequester(Person requester) {
		this.requester = requester;
	}

	public Person getClient() {
		return client;
	}

	public void setClient(Person client) {
		this.client = client;
	}

	public Person getInfluencer() {
		return influencer;
	}

	public void setInfluencer(Person influencer) {
		this.influencer = influencer;
	}

	public List<Person> getHelpers() {
		return helpers;
	}

	public void setHelpers(List<Person> helpers) {
		this.helpers = helpers;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Cause getCause() {
		return cause;
	}

	public void setCause(Cause cause) {
		this.cause = cause;
	}

	public Solution getSolution() {
		return solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	@Override
	public String toString() {
		return "Issue [id=" + id + ", description=" + description + ", requester=" + requester + ", client=" + client
				+ ", influencer=" + influencer + ", helpers=" + helpers + ", steps=" + steps + ", cause=" + cause
				+ ", solution=" + solution + ", creationDate=" + creationDate + ", startDate=" + startDate
				+ ", finishDate=" + finishDate + "]";
	}

}
