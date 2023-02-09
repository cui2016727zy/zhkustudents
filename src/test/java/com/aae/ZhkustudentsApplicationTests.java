package com.aae;

import com.aae.entity.Student;
import com.aae.service.Impl.StudentServiceImpl;
import com.aae.service.StudentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZhkustudentsApplicationTests {

    @Autowired
    StudentService service;

    @Test
    void contextLoads() {
        System.out.println(service.list());
    }
    @Test
    void testPage(){
        IPage<Student> page=service.getPage(2,8);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
    }

}
