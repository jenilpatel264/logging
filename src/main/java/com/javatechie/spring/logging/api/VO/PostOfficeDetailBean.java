package com.javatechie.spring.logging.api.VO;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;





@Entity
public class PostOfficeDetailBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@JsonProperty("Name")
	@Column(name =  "Name")
	private String name;
	
	@JsonProperty("Description")
	@Column(name =  "Description")
	private String description;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@JsonProperty("BranchType")
	@Column(name =  "BranchType")
	private String branchType;
	
	@JsonProperty("DeliveryStatus")
	@Column(name =  "DeliveryStatus")
	private String deliveryStatus;
	
	@JsonProperty("Circle")
	@Column(name =  "Circle")
	private String circle;
	
	@JsonProperty("District")
	@Column(name =  "District")
	private String district;
	
	@JsonProperty("Division")
	@Column(name =  "Division")
	private String division;
	
	@JsonProperty("Region")
	@Column(name =  "Region")
	private String region;
	
	@JsonProperty("State")
	@Column(name =  "State")
	private String state;
	
	@JsonProperty("Country")
	@Column(name =  "Country")
	private String country;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("Pincode")
	private String pincode;

}
