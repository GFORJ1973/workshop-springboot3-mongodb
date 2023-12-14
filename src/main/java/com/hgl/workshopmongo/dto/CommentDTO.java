package com.hgl.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String text;
	private Date date;
	private AuthorDTO Author;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		Author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return Author;
	}

	public void setAuthor(AuthorDTO author) {
		Author = author;
	}
}
