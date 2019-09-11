package com.yangxu.hrm.service;


import com.yangxu.hrm.doc.EsCourse;
import com.yangxu.hrm.query.EsCourseQuery;
import com.yangxu.hrm.util.PageList;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yhptest
 * @since 2019-09-05
 */
public interface IEsCourseService {

    void updateById(EsCourse esCourse);

    void insert(EsCourse esCourse);

    void deleteById(Long id);

    EsCourse selectById(Long id);

    List<EsCourse> selectList(Object o);

    PageList<EsCourse> selectListPage(EsCourseQuery query);

    void batchSave(List<EsCourse> ids);

    void batchDel(List<EsCourse> esCourseList);
}
