package com.travel.projectSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.projectSecurity.model.Product;
import com.travel.projectSecurity.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("")
	public ResponseEntity<?> getProduct(){
		return new ResponseEntity<>("Product Get", HttpStatus.OK);
	}
	@PostMapping("")
	public ResponseEntity<?> insertProduct(){
		return new ResponseEntity<>("Product Post", HttpStatus.OK);
	}
	
	@Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String showProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

}
