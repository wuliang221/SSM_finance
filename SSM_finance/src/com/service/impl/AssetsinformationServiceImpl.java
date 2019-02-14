package com.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.AssetsinformationMapper;
import com.pojo.Assetsinformation;
import com.service.AssetsinformationService;
@Service
public class AssetsinformationServiceImpl implements AssetsinformationService {

	@Resource
	private AssetsinformationMapper assetsinformationMapper;
	@Override
	public int countAll() {
		return assetsinformationMapper.countAll();
	}

	@Override
	public List<Assetsinformation> findAll(Integer pageNo, Integer pageSize) {
		return assetsinformationMapper.selectAll(pageNo, pageSize);
	}

	@Override
	public int add(Integer assetNo, String assetsName) {
		// TODO Auto-generated method stub
		return assetsinformationMapper.addAssetsinformation(assetNo, assetsName);
	}

	@Override
	public int del(Integer id) {
		// TODO Auto-generated method stub
		return assetsinformationMapper.delAssetsinformation(id);
	}

	@Override
	public Assetsinformation assetsinformation(Integer id) {
		// TODO Auto-generated method stub
		return assetsinformationMapper.assetsinformation(id);
	}

	@Override
	public int change(Integer id, Integer assetNo,
			String assetsName, Date modifyDate) {
		// TODO Auto-generated method stub
		return assetsinformationMapper.updateAssetsinformation(id, assetNo, assetsName, modifyDate);
	}

}
