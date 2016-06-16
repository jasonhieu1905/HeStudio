package com.hestudio.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hestudio.dao.CategoryDAO;
import com.hestudio.model.Category;
import com.hestudio.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl  implements CategoryService{

	private CategoryDAO categoryDAO;
	
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	public List<Category> listCategoryParent() {
		return categoryDAO.listCategoryParent();
	}

}
