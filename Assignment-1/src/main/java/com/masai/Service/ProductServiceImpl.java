package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.ProductDTO;
import com.masai.Model.products;
import com.masai.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo prepo;
	
	@Override
	public ProductDTO getProductBasedOnCategory(String category) {
		products product = prepo.findByCategory(category);
		ProductDTO pd=new ProductDTO();
		
		pd.setTitle(product.getTitle());
		pd.setDescription(product.getDescription());
		
		return pd;
	}

	@Override
	public products saveProduct(products prod) {
		 
		if(prod!=null&&prod.getCategory()!=null) {
			 return prepo.save(prod);
		 }
		return null;
	}

	@Override
	public List<products> getAllEntries() {
		List<products> plist = prepo.findAll();
		if(plist.size()!=0) {
			return plist;
		}
		return null;
	}

	
}
