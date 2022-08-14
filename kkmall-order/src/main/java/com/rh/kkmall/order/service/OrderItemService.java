package com.rh.kkmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rh.common.utils.PageUtils;
import com.rh.kkmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 22:14:37
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

