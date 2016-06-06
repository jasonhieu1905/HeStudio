package com.hestudio.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hestudio.dao.LogoDAO;
import com.hestudio.model.Logo;

@Repository
public class LogoDAOImpl extends AbstractDAOImpl implements LogoDAO{
	
	@SuppressWarnings("unchecked")
	public List<Logo>  getAllLogo() {
		return getSession().getNamedQuery("Logo.findAll").list();
	}

}
