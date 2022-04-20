package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_PATIENT_CASE")
public class Case {
    @TableId("C_ID")
    Long id;

    @TableField("C_PATIENT")
    Long pid;

    @TableField("C_TYPE")
    Integer type;

    @TableField("C_TITLE")
    String title;

    @TableField("C_DESC")
    String description;

    @TableField("C_NOTE")
    String note;

    @TableField("C_UPLOAD_TIME")
    Date uploadTime;

    @TableField("C_INSPECTION_TIME")
    Date inspectionTime;
}
