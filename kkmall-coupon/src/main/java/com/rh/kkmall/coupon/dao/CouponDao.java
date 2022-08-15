package com.rh.kkmall.coupon.dao;

import com.rh.kkmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-14 10:47:53
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
