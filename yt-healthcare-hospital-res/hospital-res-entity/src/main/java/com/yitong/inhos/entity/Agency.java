package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_AGENCY")
public class Agency {

    @TableId("A_ID")
    private Long id;

    @TableField("A_NAME")
    private String name;

    @TableField("A_LOGO")
    private String logo;

    @TableField("A_TITLE")
    private String title;

    @TableField("A_REG_TIME")
    private Date regTime;

    @TableField("A_UPD_TIME")
    private Date updTime;
}
