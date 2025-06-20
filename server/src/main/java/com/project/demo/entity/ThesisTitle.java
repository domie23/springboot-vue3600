package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 论文题目：(ThesisTitle)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ThesisTitle")
public class ThesisTitle implements Serializable {

    // ThesisTitle编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thesis_title_id")
    private Integer thesis_title_id;

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
    // 截止日期
    @Basic
    private Timestamp closing_date;
    // 论文要求
    @Basic
    private String thesis_requirements;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
