package com.adpguima.nobodyknows.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

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

	@Column(name = "TITLE", unique = true, nullable = false)
	@NotBlank
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CREATION_DATE", columnDefinition = "DATE")
	private Date creationDate;

	@Column(name = "START_DATE", columnDefinition = "DATE")
	private Date startDate;

	@Column(name = "FINISH_DATE", columnDefinition = "DATE")
	private Date finishDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Issue [id=" + id + ", title=" + title + ", description=" + description + ", creationDate="
				+ creationDate + ", startDate=" + startDate + ", finishDate=" + finishDate + "]";
	}

}
