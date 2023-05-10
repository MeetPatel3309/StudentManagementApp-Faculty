package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vo.UserVo;

@Service
public class AdminService {

	@Autowired
	RestTemplate restTemplate;
	
	public List<UserVo> getAllUsers()
	{
//		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<UserVo>> response = restTemplate.exchange("http://ADMIN-SERVICE/admin/user", 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<UserVo>>() {
		});
		List<UserVo> list = response.getBody();
		
		return list;
	}
	
	//add user
	public UserVo addUser(UserVo userVo)
	{
//		UserVo response = restTemplate.execute(null, null, null, null, null)
		return userVo;
	}
}
