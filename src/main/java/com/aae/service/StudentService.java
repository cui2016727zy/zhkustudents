package com.aae.service;

import com.aae.entity.Student;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface StudentService extends IService<Student> {
    IPage<Student> getPage(int currentPage, int pageSize);

    IPage<Student> getPage(int currentPage, int pageSize, Student student);
}
