package com.infosys.stream.casestudy;

public class Candidate {

	private String name;
	private String technicalExpertise;
	private String city;
	private int yearsOfExperience;
	
	
	public Candidate(String name, String technicalExpertise, String city,int yearsOfExperience) {
		super();
		this.name = name;
		this.technicalExpertise = technicalExpertise;
		this.city = city;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicalExpertise() {
		return technicalExpertise;
	}
	public void setTechnicalExpertise(String technicalExpertise) {
		this.technicalExpertise = technicalExpertise;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", technicalExpertise="
				+ technicalExpertise + ", city=" + city
				+ ", yearsOfExperience=" + yearsOfExperience + "]";
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearOfExperience) {
		this.yearsOfExperience = yearOfExperience;
	}
	
	
	
	
}
