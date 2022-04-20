package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("YT_DEPARTMENT")
public class Department {

    @TableId("D_ID")
    private Long id;

    @TableField("D_NAME")
    private String name;

    @TableField("D_PROFILES")
    private String profiles;
}
