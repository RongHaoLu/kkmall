package com.rh.kkmall.order.dao;

import com.rh.kkmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 22:14:37
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
