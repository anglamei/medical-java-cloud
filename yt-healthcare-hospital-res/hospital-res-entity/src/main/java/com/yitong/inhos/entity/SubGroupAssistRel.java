package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("YT_SUB_GROUP_DOCTOR")
public class SubGroupAssistRel {

    @TableField("A_ID")
    private Long assist;

    @TableField("SG_ID")
    private Long subGroup;

    @TableField("ATTRS")
    private String attrs;
}
