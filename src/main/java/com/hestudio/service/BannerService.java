package com.hestudio.service;

import java.util.List;

import com.hestudio.model.Banner;

public interface BannerService {
	public List<Banner> listAllBanners() ;
	void addBanner(Banner banner);
	void updateBanner(Banner banner);
	void deleteBanner(Banner banner);
}
