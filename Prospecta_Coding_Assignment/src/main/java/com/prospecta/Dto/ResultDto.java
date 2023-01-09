package com.prospecta.Dto;

public class ResultDto {
		
	public String title;
	
	public String description;

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

	@Override
	public String toString() {
		return "ResultDto [title=" + title + ", description=" + description + "]";
	}

	public ResultDto(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public ResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
