package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 导师用户：(TutorUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TutorUser")
public class TutorUser implements Serializable {

    // TutorUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_user_id")
    private Integer tutor_user_id;

    // 导师工号
    @Basic
    private String tutor_id;
    // 导师姓名
    @Basic
    private String tutor_name;
    // 导师性别
    @Basic
    private String mentor_gender;
    // 导师年龄
    @Basic
    private String tutor_age;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
