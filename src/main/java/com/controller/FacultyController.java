package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AdminService;
import com.vo.UserVo;

@RequestMapping("/faculty")
@RestController
public class FacultyController {

	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/userFromAdmin")
	public List<UserVo> getAllUsersFromAdmin()
	{
		List<UserVo> userList =  adminService.getAllUsers();
		return userList;
	}
	
	@PostMapping("userFromAdmin")
	public UserVo addUserFromFaculty(@RequestBody UserVo userVo)
	{
//		adminService.
		return null;
	}
	
}

