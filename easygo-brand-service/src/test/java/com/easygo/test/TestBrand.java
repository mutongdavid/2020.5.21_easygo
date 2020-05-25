package com.easygo.test;

import com.easygo.mapper.BrandMapper;
import com.easygo.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:描述
 * author:mutong(david)
 * time:0:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBrand {
    @Resource
    BrandMapper brandMapper;

    @Test
    public void testBrands(){
        System.out.println(brandMapper);
        List<Brand> brands = brandMapper.getBrands();
        for (Brand brand:brands) {
            System.out.println(brand);
        }
    }

    @Test
    public void testGetByid(){
        Brand brand = brandMapper.getBrandById(1);
        System.out.println(brand);
    }

    @Test
    public void testAdd(){
        Brand brand = new Brand();
        brand.setName("测试品牌");
        brand.setFirst_char("C");
        brand.setImage("234.jpg");
        int count = brandMapper.addBrand(brand);
        System.out.println(count>0?"成功":"失败");
    }

    @Test
    public void testUpdate(){
        Brand brand = brandMapper.getBrandById(1);
        System.out.println(brand);
        brand.setName("更新的测试");
        int count = brandMapper.updateBrand(brand);
        System.out.println(count>0?"成功":"失败");
    }
}
