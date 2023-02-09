package com.aae.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-02-09 18:39:10
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -10733903190261548L;
    
    private Integer id;
    
    private String name;
    
    private String sex;
    
    private Integer round;
    
    private String education;
    
    private Integer len;
    
    private Integer year;
    
    private String department;
    
    private String major;
    
    private Integer grade;
    
    private String classes;
    
    private Long studentid;
    
    private String subject;
    
    private Long examid;
    
    private String ensure;

}

