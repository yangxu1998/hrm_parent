package com.yangxu.hrm.service;

import com.yangxu.hrm.domain.Course;
import com.yangxu.hrm.query.CourseQuery;
import com.yangxu.hrm.util.PageList;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yhptest
 * @since 2019-09-03
 */
public interface ICourseService extends IService<Course> {

    /**
     * 分页+高级查询+关联查询
     * @param query
     * @return
     */
    PageList<Course> selectListPage(CourseQuery query);

    /**
     * 上线
     * @param ids
     */
    void onLine(Long[] ids);

    /**
     *
     * @param ids
     */
    void offLine(Long[] ids);
}
