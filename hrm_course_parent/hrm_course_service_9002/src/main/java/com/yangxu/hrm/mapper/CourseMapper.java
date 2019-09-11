package com.yangxu.hrm.mapper;

import com.yangxu.hrm.domain.Course;
import com.yangxu.hrm.query.CourseQuery;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhptest
 * @since 2019-09-03
 */
public interface CourseMapper extends BaseMapper<Course> {

    List<Course> loadListPage(Page<Course> page, @Param("query") CourseQuery query);

    /**
     *
     * @param ids
     */
    void batchOnline(List<Long> ids);

    /**
     * 下线
     * @param ids
     */
    void batchOffline(List<Long> ids);
}
