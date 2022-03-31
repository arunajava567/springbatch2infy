package com.infy.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

public class CustomerDTO {

	private Integer customerId;

	@Email(message = "{customer.emailid.invalid}")
	@NotNull(message = "{customer.emailid.absent}")
	private String emailId;

	@NotNull(message = "{customer.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{customer.name.invalid}")
	private String name;

	@PastOrPresent(message = "customer.dob.invalid")
	private LocalDate dateOfBirth;

	public CustomerDTO() {

	}

	public CustomerDTO(Integer customerId, String emailId, String name) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.name = name;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", emailId=" + emailId + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	
}
