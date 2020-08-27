package com.yujie.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yujie.gmall.pms.entity.ProductAttributeValue;
import com.yujie.gmall.pms.mapper.ProductAttributeValueMapper;
import com.yujie.gmall.pms.service.ProductAttributeValueService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author yujie
 * @since 2020-08-27
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}
