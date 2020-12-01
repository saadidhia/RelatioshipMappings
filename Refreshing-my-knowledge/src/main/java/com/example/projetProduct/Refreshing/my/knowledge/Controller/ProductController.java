package com.example.projetProduct.Refreshing.my.knowledge.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetProduct.Refreshing.my.knowledge.Model.Product;
import com.example.projetProduct.Refreshing.my.knowledge.Sercice.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/products")
	public List<Product> get(){
		return productService.getProducts();
	}
	
	@GetMapping("/product/{name}")
	public Product getProduct(@PathVariable("name") String name) {
		return productService.FindProductService(name);
	}
	
	@PostMapping("/post/product")
	public Product saveProduct() {
		Product p=new Product("computer2",15.2f,"goood");
		 productService.add(p);
		 return p;
	}
	
	@GetMapping("/message")
	public String Message(@RequestParam(defaultValue="hi",required=false) String p) {
		return "HEllo World"+" "+p;
	}
	
	
}
