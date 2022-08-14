package com.rh.kkmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rh.common.utils.PageUtils;
import com.rh.kkmall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 21:32:24
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

