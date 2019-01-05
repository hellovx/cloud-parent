package com.zh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zh.api.entity.dept.Dept;

@RestController
@RequestMapping("/condept")
public class DeptConsumerController {
	
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/list")
	public List<Dept> deptList() {
		log.info("进入consumer-Controller");
		return (List<Dept>) restTemplate.getForObject("http://cloudProviderInfo/dept/list", List.class);
	}

}
