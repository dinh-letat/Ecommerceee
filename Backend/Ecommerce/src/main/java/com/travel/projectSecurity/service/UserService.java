package com.travel.projectSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.travel.projectSecurity.model.User;
import com.travel.projectSecurity.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	//private final PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserService(UserRepository userRepository //,  PasswordEncoder passwordEncoder
			) {
		this.userRepository = userRepository;
		//this.passwordEncoder = passwordEncoder;
	}
	
	public void registerUser(User user) {
		// Mã hoá mật khẩu trước khi lưu vào cơ sở dữ liệu
		//user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		// Lưu người dùng mới vào cơ sở dữ liệu
		userRepository.save(user);
	}
	
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
