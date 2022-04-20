package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_SYMPTOM")
public class Symptom {
    @TableId("S_ID")
    Long id;

    @TableField("SYMPTOM_NO")
    String symptomNO;

    @TableField("S_TYPE")
    Integer type;

    @TableField("S_TITLE")
    String title;

    @TableField("S_NOTE")
    String note;

    @TableField("S_PIC")
    String pic;

    @TableField("S_CREATE_TIME")
    Date createTime;
}
