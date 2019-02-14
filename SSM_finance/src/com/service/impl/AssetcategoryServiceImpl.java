package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.AssetcategoryMapper;
import com.pojo.Assetcategory;
import com.service.AssetcategoryService;
@Service
public class AssetcategoryServiceImpl implements AssetcategoryService {

	@Resource
	private AssetcategoryMapper assetcategoryMapper;
	@Override
	public int assetCount() {
		return assetcategoryMapper.assetCount();
	}

	@Override
	public List<Assetcategory> selectAll(Integer pagNo, Integer pageSize) {
		return assetcategoryMapper.selectAll(pagNo, pageSize);
	}

	@Override
	public int add(String name) {
		return assetcategoryMapper.addAssetcategory(name);
	}

	@Override
	public int del(Integer id, Integer del) {
		return assetcategoryMapper.delAssetcategory(id, del);
	}

	@Override
	public int updateById(Integer id, String name) {
		return assetcategoryMapper.updateAssetcategory(id, name);
	}

}
