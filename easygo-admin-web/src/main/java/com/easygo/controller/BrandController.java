package com.easygo.controller;

import com.easygo.api.BrandClient;
import com.easygo.pojo.Brand;
import com.easygo.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

/**
 * description:描述
 * author:mutong(david)
 * time:21:25
 */

@Controller
@Scope("prototype")
public class BrandController {
    @Autowired
    BrandClient brandClient;

    @RequestMapping("/brand_getBrands")
    public String getBrands(Model model){
        List<Brand> brands = brandClient.getBrands();
        model.addAttribute("brands",brands);
        return "brand";
    }

    @RequestMapping("/brand_add")
    @ResponseBody
    public MessageResult addBrand(Brand brand){
        MessageResult results = null;
        int count = brandClient.addBrand(brand);
        if (count>0){
            results= new MessageResult(200,"新增成功");
        }else {
            results=new MessageResult(500,"新增失败");
        }
        return results;
    }

//    @RequestMapping("/brand_getBrandById")
//    @ResponseBody
//    public Brand getBrandById(Integer id){
//        return brandClient.getBrandById(id);
//    }
}
