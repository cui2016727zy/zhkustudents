package com.aae.controller;


import com.aae.entity.R;
import com.aae.entity.Student;
import com.aae.mapper.StudentMapper;
import com.aae.service.StudentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/zhku")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/students")
    public R all(){
        return R.ok(studentMapper.findAll());
    }

//    @GetMapping("/students/{currentPage}/{pageSize}")
//    public IPage<Student> getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//        return studentService.getPage(currentPage, pageSize);
//    }
    @GetMapping("/students/{currentPage}/{pageSize}")
    public IPage<Student> getPage(@PathVariable int currentPage, @PathVariable int pageSize,Student student) {
        IPage<Student> page=studentService.getPage(currentPage,pageSize,student);
        if (currentPage>page.getPages()){
            page=studentService.getPage((int) page.getPages(),pageSize,student);
        }
        return page;
    }

}
