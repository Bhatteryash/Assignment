package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.ProductDTO;
import com.masai.Model.products;
import com.masai.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pserv;
	
	@GetMapping("/getBaseOnCategory/{categroy}")
	public ResponseEntity<ProductDTO> getProductBasedOnCategory(@PathVariable String category) {
		return new ResponseEntity<ProductDTO>(pserv.getProductBasedOnCategory(category), HttpStatus.OK);
	}

	@PostMapping("/saveProduct")
	public ResponseEntity<products> saveProduct(@RequestBody products prod) {
		return new ResponseEntity<products>(pserv.saveProduct(prod), HttpStatus.CREATED);
	}

	@GetMapping("/entries")
	public ResponseEntity<List<products>> getAllEntries(){
		return new ResponseEntity<List<products>>(pserv.getAllEntries(),HttpStatus.OK);
	}

}
