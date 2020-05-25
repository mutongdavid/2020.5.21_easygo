package com.easygo.service;

import com.easygo.pojo.Brand;

import java.util.List;

/**
 * description:描述
 * author:mutong(david)
 * time:20:15
 */
public interface BrandService {
    public List<Brand> getBrands();

    public int addBrand(Brand brand);

    public int updateBrand(Brand brand);

    public Brand getBrandById(Integer id);

    public int deleteBrand(Integer id);
}
