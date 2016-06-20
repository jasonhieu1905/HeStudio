package com.hestudio.dao;

import java.util.List;

import com.hestudio.model.Banner;

public interface BannerDAO {

	List<Banner> listAllBanners();
	void addBanner(Banner banner);
	void updateBanner(Banner banner);
	void deleteBanner(Banner banner);
}
