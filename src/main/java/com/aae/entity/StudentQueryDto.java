package com.aae.entity;

import lombok.Data;


@Data
public class StudentQueryDto {
    private String name;
    private String sex;
    private Integer round;
    private String education;
    private Integer len;
    private Integer year;
    private String department;
    private String major;
    private Long studentid;
    private String subject;
    private Long examid;
    private String ensure;
    private String classes;
    private final int page;
    private final int size;

}
