package com.songge.sb_test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SbProperties {
	@Value("${com.sb.title}")
	private String title;
	
	@Value("${com.sb.comment}")
	private String comment;

	public String getTitle() {
		return title;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getComment() {
		return comment;
	}
	

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
