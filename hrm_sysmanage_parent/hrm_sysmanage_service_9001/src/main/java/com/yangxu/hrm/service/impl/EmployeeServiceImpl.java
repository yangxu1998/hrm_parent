package com.yangxu.hrm.service.impl;

import com.yangxu.hrm.domain.Employee;
import com.yangxu.hrm.mapper.EmployeeMapper;
import com.yangxu.hrm.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
