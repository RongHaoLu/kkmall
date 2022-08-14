package com.rh.kkmall.member.dao;

import com.rh.kkmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 21:52:07
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
