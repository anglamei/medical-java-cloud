package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jnpf.exception.DataException;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_ABOUT_US")
public class AboutUs {
    @TableId("AU_ID")
    Long id;

    @TableField("A_ID")
    Long agency;

    @TableField("AU_NAME")
    String name;

    @TableField("AU_CONTENT")
    String content;

    @TableField("AU_URL")
    String url;

    @TableField(value = "AU_REG_TIME", fill = FieldFill.INSERT)
    Date regTime;
}
