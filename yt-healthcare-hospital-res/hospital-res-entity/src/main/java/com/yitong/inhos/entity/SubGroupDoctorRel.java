package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("YT_SUBGROUP_ASSIST")
public class SubGroupDoctorRel {
    @TableField("SG_ID")
    private Long subGroup;

    @TableField("D_ID")
    private Long doctor;

    @TableField("ATTRS")
    private String attrs;
}
