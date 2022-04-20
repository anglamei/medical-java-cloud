package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_BODY_BASE_INFO")
public class BodyBaseInfo {

    @TableId("B_ID")
    Long id;

    @TableField("SUB_ID")
    Long subscriber;

    @TableField("B_GENDER")
    Integer gender;

    @TableField("B_AGE")
    Integer age;

    @TableField("B_REMARKS")
    String remarks;

    @TableField("B_HEIGHT")
    Integer height;

    @TableField("B_WEIGHT")
    Integer weight;
}
