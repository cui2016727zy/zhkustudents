package com.aae.service.Impl;

import com.aae.entity.Student;
import com.aae.entity.StudentQueryDto;
import com.aae.mapper.StudentMapper;
import com.aae.service.StudentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author Aae
* @description 针对表【student】的数据库操作Service实现
* @createDate 2023-02-08 23:46:23
*/
@Service
public  class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

    @Autowired
    public StudentMapper studentMapper;


    public List<Student> findAll() {
        return studentMapper.findAll();
    }


    @Override
    public IPage<Student> getPage(int currentPage, int pageSize) {
        IPage<Student> page=new Page<>(currentPage,pageSize);
        studentMapper.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<Student> getPage(int currentPage, int pageSize, Student student) {
        IPage<Student> page=new Page<>(currentPage,pageSize);
        LambdaQueryWrapper<Student> lqw=new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(student.getName()),Student::getName,student.getName());
        lqw.like(Strings.isNotEmpty(student.getClasses()),Student::getClasses,student.getClasses());
        studentMapper.selectPage(page,lqw);
        return page;
    }
}




