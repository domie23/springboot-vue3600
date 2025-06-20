package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 导师答疑：(TutorAnswersQuestions)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TutorAnswersQuestions")
public class TutorAnswersQuestions implements Serializable {

    // TutorAnswersQuestions编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_answers_questions_id")
    private Integer tutor_answers_questions_id;

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
    // 留言内容
    @Basic
    private String message_content;
    // 内容回复
    @Basic
    private String content_reply;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
