package com.easygo.service.impl;

import com.easygo.mapper.BrandMapper;
import com.easygo.pojo.Brand;
import com.easygo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:描述
 * author:mutong(david)
 * time:20:15
 */
@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    BrandMapper brandMapper;

    @Override
    public List<Brand> getBrands() {
        return brandMapper.getBrands();
    }

    @Override
    public int addBrand(Brand brand) {
        return brandMapper.addBrand(brand);
    }

    @Override
    public int updateBrand(Brand brand) {
        return brandMapper.updateBrand(brand);
    }

    @Override
    public Brand getBrandById(Integer id) {
        return brandMapper.getBrandById(id);
    }

    @Override
    public int deleteBrand(Integer id) {
        return 0;
    }
}
