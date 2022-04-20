package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_DOCTOR")
public class Doctor {

    @TableId("D_ID")
    private Long id;

    @TableField("D_DOCTOR_NO")
    private String doctorNo;

    @TableField("D_NAME")
    private String dName;

    @TableField("D_STATUS")
    private Integer dStatus;

    @TableField("D_VERIFIED")
    private Integer verified;

    @TableField(value = "D_REG_TIME", fill = FieldFill.INSERT)
    private Date regTime;

    @TableField("D_DOC_TITLE")
    private Integer docTitle;

    @TableField("D_TEACH_TITLE")
    private Integer teaTitle;

    @TableField("D_PIC1")
    private String pic1;

    @TableField("D_PIC2")
    private String pic2;

    @TableField("D_PIC3")
    private String pic3;

    @TableField("D_TYPE")
    private Integer dType;

    @TableField("D_GOOD_AT")
    private String goodAt;

    @TableField("D_PROFILES")
    private String profiles;

    @TableField("D_REMARKS")
    private String dRemarks;

    @TableField("D_BOOKING")
    private String booking;

    @TableField("D_BOOKING_REMARKS")
    private String bookingRemarks;

    @TableField("D_CELLPHONE")
    private String cellphone;

    @TableField("D_DEPT")
    private Long deptId;

    @TableField("D_HOSPITAL")
    private Long hospitalId;

    @TableField("D_ASSIST")
    private Long assistId;

    @TableField("D_CLIENT")
    private Long wxID;

    //后来补充的属性字段
    /**
     * 咨询范围
     */
    @TableField("D_CONSULTATION_SCOPE")
    private String consultationScope;

    /**
     * 医生头像
     */
    @TableField("D_AVATAR")
    private String headPortrait;

    /**
     * 性别
     */
    @TableField("D_SEX")
    private Integer sex;

    /**
     * 生日
     */
    @TableField("D_BIRTHDAY")
    private Date birthday;

    /**
     * 与助理绑定状态
     */
    @TableField("D_BINDING_STATUS")
    private Integer bindingStatus;

    /**
     * 更新时间
     */
    @TableField(value = "D_UPD_TIME", fill= FieldFill.UPDATE)
    private Date updateTime;
}
