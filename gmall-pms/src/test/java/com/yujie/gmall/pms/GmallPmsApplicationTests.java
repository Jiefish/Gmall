package com.yujie.gmall.pms;

import com.yujie.gmall.pms.entity.Brand;
import com.yujie.gmall.pms.service.BrandService;
import com.yujie.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        System.out.println(productService.getById(1));
//        Brand brand = new Brand();
//        brand.setName("sssss");
//        brandService.save(brand);
//        System.out.println("保存成功");

        System.out.println(brandService.getById(53));
    }



}
