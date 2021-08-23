package com.example.demo.survey;

import javax.validation.constraints.*;

public class SurveyForm {

	@NotNull
	@Min(0)
	@Max(100)
	private int age;
	
	@NotNull
	@Min(1)
	@Max(5)
	private int satisfaction;
	
	@NotNull
	@Size(min = 1,max = 200,message = "入力は1文字~200文字までです")
	private String comment;
	
	public SurveyForm() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
