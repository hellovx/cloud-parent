package com.zh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zh.api.entity.dept.Dept;
import com.zh.mapper.dept.DeptMapper;
import com.zh.service.DeptService;

@Service
@Transactional(rollbackFor = Exception.class)
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<Dept> findList() {
		// TODO Auto-generated method stub
		return deptMapper.findList();
	}

}
