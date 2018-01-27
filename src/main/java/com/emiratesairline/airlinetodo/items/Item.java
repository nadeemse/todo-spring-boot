package com.emiratesairline.airlinetodo.items;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Model class 

@Entity
@Table(name="items")
@JsonIgnoreProperties(value = {"created_at", "updated_at"}, 
allowGetters = true)
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date created_at;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updated_at;
	
	
	private String due_at;
	
	@Column
	private String title;
	
	@Column
	private String note;
	
	@Column
	private String type;
	
	@Column
	private String tags;
	
	@Column
	private Boolean checked;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	
	public Item() {}

	public Item(Long id, Date created_at, Date updated_at, String due_at, String title, String note,
			String type, String tags, Boolean checked, Long user_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.due_at = due_at;
		this.title = title;
		this.note = note;
		this.type = type;
		this.tags = tags;
		this.checked = checked;
		this.user_id = user_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getDue_at() {
		return due_at;
	}

	public void setDue_at(String due_at) {
		this.due_at = due_at;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	

}