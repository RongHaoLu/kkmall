package com.rh.kkmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rh.common.utils.PageUtils;
import com.rh.kkmall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 22:31:01
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

