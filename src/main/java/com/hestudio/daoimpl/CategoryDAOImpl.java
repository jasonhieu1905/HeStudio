package com.hestudio.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hestudio.dao.CategoryDAO;
import com.hestudio.model.Category;

@Repository
public class CategoryDAOImpl extends AbstractDAOImpl implements CategoryDAO {

	@SuppressWarnings("unchecked")
	public List<Category> listCategoryParent() {
		return getSession().getNamedQuery("findByParent").list();
	}

	public void addCategory(Category category) {
		getSession().persist(category);
	}

	public void updateCategory(Category category) {
		getSession().update(category);
	}

	public void deleteCategory(Category category) {
		getSession().delete(category);		
	}

}
