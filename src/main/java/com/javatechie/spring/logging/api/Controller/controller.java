package com.javatechie.spring.logging.api.Controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.javatechie.spring.logging.api.SpringBootLoggingApplication;

import com.javatechie.spring.logging.api.VO.MoviesResponse;
import com.javatechie.spring.logging.api.VO.PostOfficeDetailBean;
import com.javatechie.spring.logging.api.VO.PostOfficeResponseBean;
import com.javatechie.spring.logging.api.VO.requestVO;
import com.javatechie.spring.logging.api.VO.responseDAO;
import com.javatechie.spring.logging.api.VO.results;

@RestController
public class controller {
	
	//Logger log = LoggerFactory.getLogger(SpringBootLoggingApplication.class);
	
	@Autowired RestTemplate restTemplate;
	@Autowired responseDAO responseDAO;
	
	
	@GetMapping("/city")
	public String greeting() {
		
		String uri = "https://ott-details.p.rapidapi.com/advancedsearch";
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.set("X-RapidAPI-Key", "1a50e8da05msh37ee4cebf7262d8p11bc2djsn68a36cce3556");
		httpHeaders.set("X-RapidAPI-Host", "ott-details.p.rapidapi.com");
		
		HttpEntity<requestVO> request=new HttpEntity<>(httpHeaders);
		RestTemplate restTemplate=new RestTemplate();
		System.out.println("hello");
	    ResponseEntity<MoviesResponse> responseEntity=restTemplate.exchange(uri,HttpMethod.GET, request,MoviesResponse.class);
		MoviesResponse ans=responseEntity.getBody();
		System.out.println(ans.getResults().size());
		
		for (results r : ans.getResults()) {
			System.out.println(r);
		}
		
//		for (MoviesResponse moviesResponse : ans) {
//			System.out.println(moviesResponse.getPage());
//		}
		
		return "";
		
		
		
//		RestTemplate restTemplate=new RestTemplate();
//		
//		ResponseEntity<PostOfficeResponseBean[]> responseEntity=
//		restTemplate.getForEntity(uri, PostOfficeResponseBean[].class);
//		
//		PostOfficeResponseBean[] officeResponseBeans=responseEntity.getBody();
//		
//		for (PostOfficeResponseBean postOfficeResponseBean : officeResponseBeans) {
//			List<PostOfficeDetailBean> detailBeans=postOfficeResponseBean.getPostOffice();
//			for (PostOfficeDetailBean re : detailBeans) {
//				
//				this.responseDAO.save(re);
//			}
//		}
//	return officeResponseBeans[0];
		
		
		
//		HttpHeaders httpHeaders=new HttpHeaders();
//		httpHeaders.set("X-RapidAPI-Key", "1a50e8da05msh37ee4cebf7262d8p11bc2djsn68a36cce3556");
//		httpHeaders.set("X-RapidAPI-Host", "imdb-top-100-movies.p.rapidapi.com");
//		
//		HttpEntity<requestVO> request=new HttpEntity<>(httpHeaders);
		
//		ResponseEntity<requestVO> responseEntity=restTemplate.exchange(url,HttpMethod.GET, request,requestVO.class,1);
//		
//		System.out.println(responseEntity.getBody());
//		
//	String json=responseEntity.getBody().getTitle();
//		return new  ResponseEntity<String>(json,HttpStatus.ACCEPTED);
	}

}
