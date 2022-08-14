package com.rh.kkmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rh.common.utils.PageUtils;
import com.rh.kkmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 21:52:07
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

