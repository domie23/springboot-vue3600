package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 评审答辩：(ReviewDefense)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ReviewDefense")
public class ReviewDefense implements Serializable {

    // ReviewDefense编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_defense_id")
    private Integer review_defense_id;

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
    // 论文题目
    @Basic
    private String thesis_title;
    // 答辩日期
    @Basic
    private Timestamp date_of_reply;
    // 评审人员
    @Basic
    private String assessor;
    // 答辩情况
    @Basic
    private String defense;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
