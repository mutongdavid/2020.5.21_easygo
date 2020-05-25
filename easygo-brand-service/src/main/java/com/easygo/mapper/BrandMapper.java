package com.easygo.mapper;

import com.easygo.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * description:描述
 * author:mutong(david)
 * time:0:24
 */
@Mapper
public interface BrandMapper {
    public List<Brand> getBrands();

    public int addBrand(Brand brand);

    public int updateBrand(Brand brand);

    public Brand getBrandById(Integer id);

    public int deleteBrand(Integer id);

    public int deleteSome(@Param("ids") String ids);

    public int deleteSome1(Integer[] ids);
}
