//package com.travel.projectSecurity.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//	private final UserDetailsService userDetailsService;
//	
//	@Autowired
//	public SecurityConfig(UserDetailsService userDetailsService) {
//		this.userDetailsService = userDetailsService;
//	}
//	
//	
//	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//	    authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//	}
//	
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//		
//	
//	// Quy định cấu hình cho Security	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{		
//		http
//			.authorizeHttpRequests((requests) -> requests
//					.requestMatchers("/", "/home", "/login", "/register").permitAll() // không cần đăng nhập cũng truy cập được
//					.requestMatchers("/admin/**").hasRole("ADMIN")
//					.anyRequest().authenticated() // tất cả các request còn lại đều phải chứng thực
//					)
//					.formLogin((form) -> form
//							.loginPage("/login")
//							.permitAll()
//					)
//					.logout((logout) -> logout.permitAll());
//		return http.build();
//	}
//	
//	@Bean
//	@DependsOn("passwordEncoder")
//    public UserDetailsService userDetailsService() {
//        // Use PasswordEncoderFactories.createDelegatingPasswordEncoder() instead of deprecated withDefaultPasswordEncoder()
//        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//
//        UserDetails user = User.builder()
//                .username("user")
//                .password(passwordEncoder.encode("password"))
//                .roles("USER")
//                .build();
//        
//        UserDetails admin = User.builder()
//        		.username("admin")
//        		.password(passwordEncoder.encode("admin"))
//        		.roles("ADMIN")
//        		.build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }
//	
//}
//
