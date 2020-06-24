package com.mvc.jigulyeog.model.dto;

import java.util.Date;

public class TogetherDto {
	private int tog_no;
	private String tog_title;
	private String tog_content;
	private String tog_category;
	private Date tog_dead;
	private String tog_ps;
	private String user_id;
	
	public TogetherDto() {
		super();
	}

	public TogetherDto(int tog_no, String tog_title, String tog_content, String tog_category, Date tog_dead,
			String tog_ps, String user_id) {
		super();
		this.tog_no = tog_no;
		this.tog_title = tog_title;
		this.tog_content = tog_content;
		this.tog_category = tog_category;
		this.tog_dead = tog_dead;
		this.tog_ps = tog_ps;
		this.user_id = user_id;
	}

	public int getTog_no() {
		return tog_no;
	}

	public void setTog_no(int tog_no) {
		this.tog_no = tog_no;
	}

	public String getTog_title() {
		return tog_title;
	}

	public void setTog_title(String tog_title) {
		this.tog_title = tog_title;
	}

	public String getTog_content() {
		return tog_content;
	}

	public void setTog_content(String tog_content) {
		this.tog_content = tog_content;
	}
	
	

	public String getTog_category() {
		return tog_category;
	}

	public void setTog_category(String tog_category) {
		this.tog_category = tog_category;
	}

	public Date getTog_dead() {
		return tog_dead;
	}

	public void setTog_dead(Date tog_dead) {
		this.tog_dead = tog_dead;
	}

	public String getTog_ps() {
		return tog_ps;
	}

	public void setTog_ps(String tog_ps) {
		this.tog_ps = tog_ps;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
}
