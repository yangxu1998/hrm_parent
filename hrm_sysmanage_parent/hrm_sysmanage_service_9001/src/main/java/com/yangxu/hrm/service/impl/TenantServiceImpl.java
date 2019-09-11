package com.yangxu.hrm.service.impl;

import com.yangxu.hrm.domain.Tenant;
import com.yangxu.hrm.mapper.TenantMapper;
import com.yangxu.hrm.service.ITenantService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yx
 * @since 2019-09-02
 */
@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService {

}
