package com.management.mapper;

import com.management.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassesMapper {

    /**
     * 添加班级信息
     * @param classes 班级信息
     */
    void addClasses(Classes classes);

    /**
     * 删除班级信息
     * @param id 班级ID
     */
    void deleteClasses(Integer id);

    /**
     * 修改班级信息
     * <p color="red">
     *  classId不能修改
     * </p>
     * @param classes 班级信息
     */
    void updateClasses(Classes classes);


    /**
     * 根据班级Beam查询班级信息
     * @param classes 班级Bean
     * @return 查询到的班级信息
     */
    List<Classes> getClasses(Classes classes);

}
