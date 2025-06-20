package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 论文指导：(ThesisGuidance)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ThesisGuidance")
public class ThesisGuidance implements Serializable {

    // ThesisGuidance编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thesis_guidance_id")
    private Integer thesis_guidance_id;

    // 学生信息
    @Basic
    private Integer student_information;
    // 学生学号
    @Basic
    private String student_id;
    // 学生姓名
    @Basic
    private String student_name;
    // 班级名称
    @Basic
    private String class_name;
    // 导师信息
    @Basic
    private Integer tutor_information;
    // 导师工号
    @Basic
    private String tutor_id;
    // 导师姓名
    @Basic
    private String tutor_name;
    // 论文题目
    @Basic
    private String thesis_title;
    // 文档类型
    @Basic
    private String document_type;
    // 指导内容
    @Basic
    private String guidance_content;
    // 指导文档
    @Basic
    private String guidance_document;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
