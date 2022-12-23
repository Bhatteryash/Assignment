package com.masai.Service;

import java.util.List;

import com.masai.Model.ProductDTO;
import com.masai.Model.products;

public interface ProductService {

	public ProductDTO getProductBasedOnCategory(String category);
	
	public products saveProduct(products prod);
	
	public List<products> getAllEntries();
}
