package com.hestudio.dao;

import java.util.List;

import com.hestudio.model.Category;

public interface CategoryDAO {

	List<Category> listCategoryParent();
	void addCategory(Category category);
	void updateCategory(Category category);
	void deleteCategory(Category category);
	
}
