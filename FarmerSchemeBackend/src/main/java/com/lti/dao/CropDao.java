package com.lti.dao;

import java.util.List;

import com.lti.entity.Crop;

public interface CropDao {
	Crop findById(int cropId);
	public void updateCrop(Crop crop);
}
