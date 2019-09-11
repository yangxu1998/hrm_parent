package com.yangxu.hrm.client;

import com.yangxu.hrm.domain.Tenant;
import com.yangxu.hrm.query.TenantQuery;
import com.yangxu.hrm.util.AjaxResult;
import com.yangxu.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/10/8-16:18
 */
@Component
public class TenantClientHystrixFallbackFactory implements FallbackFactory<TenantClient> {

    @Override
    public TenantClient create(Throwable throwable) {
        return new TenantClient() {
            @Override
            public AjaxResult save(Tenant tenant) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Tenant get(Long id) {
                return null;
            }

            @Override
            public List<Tenant> list() {
                return null;
            }

            @Override
            public PageList<Tenant> json(TenantQuery query) {
                return null;
            }
        };
    }
}
