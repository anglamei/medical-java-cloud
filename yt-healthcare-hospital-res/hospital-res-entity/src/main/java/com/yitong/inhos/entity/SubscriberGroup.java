package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("YT_SUB_GROUP")
public class SubscriberGroup {

    @TableId("SG_ID")
    private Long id;

    @TableField("A_ID")
    private Long agency;

    @TableField("SG_NAME")
    private String name;

    @TableField("SG_DESC")
    private String description;

    @TableField("SG_PARENT_ID")
    private Long parentID;

    @TableField("SG_LEVEL")
    private Integer level;
}
