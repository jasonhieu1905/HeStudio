package com.hestudio.rest.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hestudio.model.Banner;
import com.hestudio.service.BannerService;

@RestController
public class AdminBannerController {

	@Autowired
	private BannerService bannerService;
	
	@RequestMapping(value="/getAllBanners",method = RequestMethod.GET)
	public ResponseEntity<List<Banner>> getContactInfo(){
		
		List<Banner> banners = bannerService.listAllBanners();
		if(banners.size() != 0){
			return new ResponseEntity<List<Banner>>(banners,HttpStatus.OK);
		}
		return new ResponseEntity<List<Banner>>(HttpStatus.NOT_FOUND);
	}
}
