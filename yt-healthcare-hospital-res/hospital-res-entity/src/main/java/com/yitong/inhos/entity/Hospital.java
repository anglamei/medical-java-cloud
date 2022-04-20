package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_HOSPITAL")
public class Hospital {

    @TableId("H_ID")
    private Long id;

    @TableField("H_NAME")
    private String name;

    @TableField("H_SHORT_NAME")
    private String shortName;

    @TableField("H_ZIPCODE")
    private String zipcode;

    @TableField("H_CITY")
    private String city;

    @TableField("H_PROVINCE")
    private String province;

    @TableField("H_DISTRICT")
    private String district;

    @TableField("H_ADDRESS")
    private String address;

    @TableField("H_AVATAR")
    private String avatar;

    @TableField("H_SERVICE_INFO")
    private String serviceInfo;

    @TableField("H_CONTRACT_NO")
    private String contractNO;

    @TableField("H_DESC")
    private String hDesc;

    @TableField("H_OUT_PATIENT")
    private String outPatient;

    @TableField(value="H_REG_TIME", fill = FieldFill.INSERT)
    private Date regTime;

    @TableField(value="H_UPD_TIME", fill = FieldFill.UPDATE)
    private Date updTime;

    @TableField("H_TYPE")
    private Integer type;

    @TableField("H_LEVEL")
    private Integer level;

    @TableField("H_REGION")
    private String region;

    @TableField("H_URL")
    private String url;

    @TableField("H_BASE_URL")
    private String baseURL;

    @TableField("H_OPEN_STATE")
    private Integer openState;
}
