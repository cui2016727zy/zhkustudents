package com.aae.mapper;


import com.aae.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author Aae
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-02-08 23:46:23
* @Entity com.aae.pojo.Student
*/
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    @Select("select * from student")
    List<Student> findAll();


}




