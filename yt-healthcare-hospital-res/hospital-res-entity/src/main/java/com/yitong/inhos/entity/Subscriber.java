package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("YT_SUBSCRIBER")
public class Subscriber {
    @TableId("S_ID")
    Long id;

    @TableField("WX_ID")
    Long wxid;

    @TableField("SUB_GROUP_ID")
    Long group;

    @TableField("S_NAME")
    String name;

    @TableField("S_EMPLOYEE_NO")
    String employeeNO;

    @TableField("S_CONTRACT_NO")
    String contractNO;

    @TableField("S_WORK_PLACE")
    String workPlace;

    @TableField("S_WORK_YEAR")
    String workYear;

    @TableField("S_WORK_LEVEL")
    String workLevel;

    @TableField("S_LEADERSHIP")
    Long leadership;
}
