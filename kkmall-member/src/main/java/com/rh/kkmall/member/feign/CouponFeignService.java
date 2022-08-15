package com.rh.kkmall.member.feign;

import com.rh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author RongHaoLu
 * @Date 2022/8/14 10:54
 */

@FeignClient("kkmall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
