package com.yujie.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yujie.gmall.pms.entity.ProductVertifyRecord;
import com.yujie.gmall.pms.mapper.ProductVertifyRecordMapper;
import com.yujie.gmall.pms.service.ProductVertifyRecordService;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 商品审核记录 服务实现类
 * </p>
 *
 * @author yujie
 * @since 2020-08-27
 */
@Service
@Component
public class ProductVertifyRecordServiceImpl extends ServiceImpl<ProductVertifyRecordMapper, ProductVertifyRecord> implements ProductVertifyRecordService {

}
