package com.rh.kkmall.product.dao;

import com.rh.kkmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author RongHaoLU
 * @email sunlightcs@gmail.com
 * @date 2022-08-13 21:32:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
