package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 论文成绩：(ThesisScore)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ThesisScore")
public class ThesisScore implements Serializable {

    // ThesisScore编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thesis_score_id")
    private Integer thesis_score_id;

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
    // 论文成绩
    @Basic
    private String thesis_score;
    // 备注详情
    @Basic
    private String note_details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
