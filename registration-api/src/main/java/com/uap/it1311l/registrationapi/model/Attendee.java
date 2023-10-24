package com.uap.it1311l.registrationapi.model;

public class Attendee 
{
	private String attendeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String course;
	private int age;
	private boolean surveyEligibilityTag;
	
	public String getAttendeeId() 
	{
		return attendeeId;
	}
	
	public void setAttendeeId(String attendeeId) 
	{
		this.attendeeId = attendeeId;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getMiddleName() 
	{
		return middleName;
	}
	
	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getCourse() 
	{
		return course;
	}
	
	public void setCourse(String course) 
	{
		this.course = course;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}

	public boolean isSurveyEligibilityTag() 
	{
		return surveyEligibilityTag;
	}

	public void setSurveyEligibilityTag(boolean surveyEligibilityTag) 
	{
		this.surveyEligibilityTag = surveyEligibilityTag;
	}
}
