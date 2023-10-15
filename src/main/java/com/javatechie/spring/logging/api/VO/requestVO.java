

package com.javatechie.spring.logging.api.VO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class requestVO {

		private int rank;
		
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
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
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public List<String> getGenre() {
			return genre;
		}
		public void setGenre(List<String> genre) {
			this.genre = genre;
		}
		public String getThumbnail() {
			return thumbnail;
		}
		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}
		
		public String getId1() {
			return id1;
		}
		public void setId1(String id1) {
			this.id1 = id1;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		
		@JsonProperty("title")
		private String title;
		
		@JsonProperty("description")
		private String description;
		
		@JsonProperty("image")
		private String image;
		
		@JsonProperty("genre")
		private List<String> genre;
		
		@JsonProperty("thumbnail")
		private String thumbnail;
		
		@JsonProperty("rating")
		private String ratings;
		
		public String getRatings() {
			return ratings;
		}
		public void setRatings(String ratings) {
			this.ratings = ratings;
		}

		@JsonProperty("id1")
		private String id1;
		
		@JsonProperty("year")
		private String year;
		

		

}
