package com.yangxu.hrm.client;

import com.yangxu.hrm.domain.Department;
import com.yangxu.hrm.query.DepartmentQuery;
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
public class DepartmentClientHystrixFallbackFactory implements FallbackFactory<DepartmentClient> {

    @Override
    public DepartmentClient create(Throwable throwable) {
        return new DepartmentClient() {
            @Override
            public AjaxResult save(Department department) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Department get(Long id) {
                return null;
            }

            @Override
            public List<Department> list() {
                return null;
            }

            @Override
            public PageList<Department> json(DepartmentQuery query) {
                return null;
            }
        };
    }
}
