package com.axsos.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.products.models.Category;
import com.axsos.products.models.Product;
import com.axsos.products.services.ProductCategoryService;

@Controller
public class ProductCategoryController {
	private final ProductCategoryService productCategoryService;

	public ProductCategoryController(ProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}

	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "product.jsp";
	}

	@RequestMapping(value = "/products/new", method = RequestMethod.POST)
	public String CreateNewProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "product.jsp";
		} else {
			productCategoryService.createProduct(product);
			return "redirect:/products/new";
		}

	}

	@RequestMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "category.jsp";
	}

	@RequestMapping(value = "/categories/new", method = RequestMethod.POST)
	public String CreateNewCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "category.jsp";
		} else {
			productCategoryService.createCategory(category);
			return "redirect:/categories/new";
		}

	}
	
	@RequestMapping("/products/{id}")
	public String showProduct(Model model,@PathVariable("id") Long id) {
		Product product =productCategoryService.findOneproduct(id);
		model.addAttribute("product",product);
		List<Category> unlistCategories=productCategoryService.allCategoryexept(product);
		model.addAttribute("unlist",unlistCategories);
		return "showp.jsp";
		
	}
	
	@RequestMapping(value = "/addCategory/{proId}",method = RequestMethod.POST)
	public String addCategories(@PathVariable("proId") Long proId,@RequestParam("category")Long catId) {
		productCategoryService.add(proId,catId);
		return "redirect:/products/{proId}";
	}
	
	
	@RequestMapping("/categories/{id}")
	public String showcategory(Model model,@PathVariable("id") Long id) {
		Category category =productCategoryService.findOneCategory(id);
		model.addAttribute("category",category);
		List<Product> unlistProducts=productCategoryService.allProductExept(category);
		model.addAttribute("unlist",unlistProducts);
		return "showc.jsp";
		
	}
	
	@RequestMapping(value = "/addProduct/{catId}",method = RequestMethod.POST)
	public String addProducts(@PathVariable("catId") Long catId,@RequestParam("product")Long proId) {
		productCategoryService.add(proId,catId);
		return "redirect:/categories/{catId}";
	}
}
