package com.yujie.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yujie.gmall.pms.entity.ProductCategory;
import com.yujie.gmall.pms.mapper.ProductCategoryMapper;
import com.yujie.gmall.pms.service.ProductCategoryService;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author yujie
 * @since 2020-08-27
 */
@Service(version = "1.0.0")
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

}
