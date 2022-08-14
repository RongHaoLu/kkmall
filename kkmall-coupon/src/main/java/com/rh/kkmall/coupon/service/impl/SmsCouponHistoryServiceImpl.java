package com.rh.kkmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rh.common.utils.PageUtils;
import com.rh.common.utils.Query;

import com.rh.kkmall.coupon.dao.SmsCouponHistoryDao;
import com.rh.kkmall.coupon.entity.SmsCouponHistoryEntity;
import com.rh.kkmall.coupon.service.SmsCouponHistoryService;


@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistoryEntity> implements SmsCouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponHistoryEntity> page = this.page(
                new Query<SmsCouponHistoryEntity>().getPage(params),
                new QueryWrapper<SmsCouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}