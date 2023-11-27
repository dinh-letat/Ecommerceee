package com.travel.projectSecurity.controller;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.projectSecurity.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @PostMapping("/signin")
    public ResponseEntity<?> signin(){
    	return new ResponseEntity<>("Sign in", HttpStatus.OK);
    }
    
    @PostMapping("/signup")
    public ResponseEntity<?> signup(){
    	return new ResponseEntity<>("Sign up", HttpStatus.OK);
    }
    
    
//    private final UserService userService;
//
//	// Phương thức khởi tạo
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//	// Trang chính
//	@GetMapping("/home")
//	public String home() {
//		return "home";
//	}
//	
//	// Trang đăng nhập
//	@GetMapping("/login")
//	public String loginForm() {
//		return "login";
//	}
//	@PostMapping("/login")
//	public String loginUser() {
//		return "redirect:/";
//	}
//	@GetMapping("/logout")
//    public String logout(HttpServletRequest request) {
//        request.getSession().invalidate(); // Xoá thông tin đăng nhập
//        return "redirect:/"; // Chuyển hướng về trang chủ
//    }
//	
//	// Trang đăng ký
//	@GetMapping("/register")
//	public String registerForm() {
//		return "register";
//	}
//	@PostMapping("/register")
//	public String registerUser(User user, Model model) {
//		// Kiểm tra xem tên người dùng tồn tại hay chưa
//		if (userService.findByUsername(user.getUsername()) != null) {
//			model.addAttribute("usernameExists", true);
//			return "register";
//		}
//		return "redirect:/login";
//		
//	}
	
	// Các trang khác
	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
}
