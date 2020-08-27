package com.yujie.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yujie.gmall.pms.entity.Product;
import com.yujie.gmall.pms.mapper.ProductMapper;
import com.yujie.gmall.pms.service.ProductService;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author yujie
 * @since 2020-08-27
 */
@Service(version = "1.0.0") //暴露服务
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
