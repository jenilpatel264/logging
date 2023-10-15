package com.javatechie.spring.logging.api.VO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOfficeResponseBean {
	
	@JsonProperty("Message")
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOfficeDetailBean> getPostOffice() {
		return PostOffice;
	}

	public void setPostOffice(List<PostOfficeDetailBean> postOffice) {
		PostOffice = postOffice;
	}

	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOfficeDetailBean> PostOffice;

}
