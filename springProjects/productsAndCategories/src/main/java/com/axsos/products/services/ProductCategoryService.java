package com.axsos.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.products.models.Category;
import com.axsos.products.models.Product;
import com.axsos.products.repositories.CategoryRepository;
import com.axsos.products.repositories.ProductRepository;

@Service
public class ProductCategoryService {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;

	public ProductCategoryService(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Product> findAllProduct(){
		return productRepository.findAll();
	}
	
	public List<Category> findAllCategory(){
		return categoryRepository.findAll();
	}
	
	public Product findOneproduct(Long id) {
		Optional<Product> optionalProduct=productRepository.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		}else {
			return null;
		}
	}
	
	public Category findOneCategory(Long id) {
		Optional<Category> optionalCategory=categoryRepository.findById(id);
		if (optionalCategory.isPresent()) {
			return optionalCategory.get();
		}else {
			return null;
		}
	}
	
	public List<Category> allCategoryexept(Product product){
		return categoryRepository.findByProductsNotContains(product);
	}
	
	public List<Product> allProductExept(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
	
	public void add(Long proId,Long catId) {
		Product product=productRepository.findById(proId).orElse(null);
		Category category=categoryRepository.findById(catId).orElse(null);
		List<Category> categories=product.getCategories();
		categories.add(category);
		product.setCategories(categories);
		productRepository.save(product);
		
	}

}
