package com.hestudio.service;

import java.util.List;

import com.hestudio.model.Category;

public interface CategoryService {
	List<Category> listCategoryParent();
	void addCategory(Category category);
	void updateCategory(Category category);
	void deleteCategory(Category category);
}
