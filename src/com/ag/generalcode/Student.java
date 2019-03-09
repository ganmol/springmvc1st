package com.ag.generalcode;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String secondName;
	private String country;
	private String language;
	private String [] interests;
 
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions =new LinkedHashMap<String, String> () ;
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "USA");
		countryOptions.put("UK", "UK");
		countryOptions.put("IN", "India");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	public String getLanguage() {
		return language;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}
	
	
}
