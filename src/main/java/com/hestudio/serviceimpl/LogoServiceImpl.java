package com.hestudio.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hestudio.dao.LogoDAO;
import com.hestudio.model.Logo;
import com.hestudio.service.LogoService;

@Service
@Transactional
public class LogoServiceImpl implements LogoService{

	private LogoDAO logoDAO;
	
	public void setLogoDAO(LogoDAO logoDAO) {
		this.logoDAO = logoDAO;
	}

	public List<Logo> getAllLogo() {
		return logoDAO.getAllLogo();
	}

}
