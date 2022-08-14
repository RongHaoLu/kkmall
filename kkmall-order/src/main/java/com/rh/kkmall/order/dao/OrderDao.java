package com.rh.kkmall.order.dao;

import com.rh.kkmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 22:14:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
