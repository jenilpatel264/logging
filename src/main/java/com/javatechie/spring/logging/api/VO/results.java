package com.javatechie.spring.logging.api.VO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;



public class results {
	


	public void setGenree(List<String> genree) {
		this.genree = genree;
	}

	public List<String> getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(List<String> imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "results [imgUrl=" + imgUrl + ", genree=" + genree + ", imdbid=" + imdbid + ", title=" + title
				+ ", imdbrating=" + imdbrating + ", released=" + released + ", type=" + type + ", synopsis=" + synopsis
				+ "]";
	}

	public List<String> getGenree() {
		return genree;
	}

	public void setGenre(List<String> genree) {
		this.genree = genree;
	}

	public String getImdbid() {
		return imdbid;
	}

	public void setImdbid(String imdbid) {
		this.imdbid = imdbid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImdbrating() {
		return imdbrating;
	}

	public void setImdbrating(String imdbrating) {
		this.imdbrating = imdbrating;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@JsonProperty("imageurl")
	private List<String> imgUrl;
	
	@JsonProperty("genre")
	private List<String> genree;
	
	@JsonProperty("imdbid")
	private String imdbid;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("imdbrating")
	private String imdbrating;
	
	@JsonProperty("released")
	private String released;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("synopsis")
	private String synopsis;
	
	

}
