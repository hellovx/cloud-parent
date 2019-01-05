package com.zh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zh.api.entity.dept.Dept;
import com.zh.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/list")
	public List<Dept> findList() {
		// List<Dept> list=deptService.findList();
		log.info("进入provider-Controller");
		return deptService.findList();
	}

}
