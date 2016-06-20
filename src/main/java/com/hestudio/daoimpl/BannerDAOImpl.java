package com.hestudio.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hestudio.dao.BannerDAO;
import com.hestudio.model.Banner;

@Repository
public class BannerDAOImpl extends AbstractDAOImpl implements BannerDAO{

	@SuppressWarnings("unchecked")
	public List<Banner> listAllBanners() {
		return getSession().getNamedQuery("Banner.findAll").list();
	}

	public void addBanner(Banner banner) {
		getSession().persist(banner);
	}

	public void updateBanner(Banner banner) {
		getSession().update(banner);
	}

	public void deleteBanner(Banner banner) {
		getSession().delete(banner);
	}

}
