package com.rh.kkmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rh.common.utils.PageUtils;
import com.rh.kkmall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 21:32:24
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

