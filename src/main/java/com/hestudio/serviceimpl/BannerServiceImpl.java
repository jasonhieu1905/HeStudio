package com.hestudio.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hestudio.dao.BannerDAO;
import com.hestudio.model.Banner;
import com.hestudio.service.BannerService;

@Service
@Transactional
public class BannerServiceImpl implements BannerService {

	private BannerDAO bannerDAO;
	
	public void setBannerDAO(BannerDAO bannerDAO) {
		this.bannerDAO = bannerDAO;
	}

	public List<Banner> listAllBanners() {
		return bannerDAO.listAllBanners();
	}

	public void addBanner(Banner banner) {
		 bannerDAO.addBanner(banner);
	}

	public void updateBanner(Banner banner) {
		bannerDAO.updateBanner(banner);
	}

	public void deleteBanner(Banner banner) {
		bannerDAO.deleteBanner(banner);
	}

}
