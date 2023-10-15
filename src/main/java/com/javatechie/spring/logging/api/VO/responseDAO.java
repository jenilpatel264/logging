package com.javatechie.spring.logging.api.VO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface responseDAO  extends JpaRepository<PostOfficeDetailBean, Integer>{

}
