package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_WX_ACCOUNT")
public class Client {
    @TableId("WX_ID")
    private Long id;

    @TableField("CLIENT_NO")
    private String clientNo;

    @TableField("WX_ACCOUNT")
    private String wxAccount;

    @TableField("WX_REAL_NAME")
    private String realname;

    @TableField("WX_NICK_NAME")
    private String nickname;

    @TableField("U_PASSWORD")
    private String upwd;

    @TableField("WX_ORIGIN")
    private Integer uorigin;

    @TableField("WX_AUTHORIZED")
    private Integer uauthorized;

    @TableField("WX_ENABLED")
    private Integer uenabled;

    @TableField("WX_CITY")
    private String ucity;

    @TableField("WX_PROVINCE")
    private String uprovince;

    @TableField("WX_COUNTRY")
    private String ucountry;

    @TableField("WX_SIGNATURE")
    private String signature;

    @TableField("WX_SEX")
    private Integer usex;

    @TableField("WX_BIRTHDAY")
    private Date ubirthday;

    @TableField("C_REG_TIME")
    private Date uregdate;

    @TableField("WX_AVATAR")
    private String uavatarurl;

    @TableField("C_LAST_LOGIN")
    private Date lastlogin;

    @TableField("C_LOGIN_TIMES")
    private Integer logintimes;

    @TableField("C_INVITED")
    private Long invitedby;

    @TableField("C_CELLPHONE")
    private String cellphone;

    @TableField("C_PROFESSION")
    private String profession;

    @TableField("WX_OPEN_ID")
    private String wxOpenid;

    @TableField("WX_SESSION_LEY")
    private String wxSessionkey;

    @TableField("WX_UNION_ID")
    private String wxUnionid;

    @TableField("WX_LANGUAGE")
    private String language;

    @TableField("C_EMAIL")
    private String email;

    @TableField("WX_AUTH_PHONE")
    private String authPhone;

    @TableField("C_DELETED")
    private Integer deleted;

    @TableField("TEXT_RESERV1")
    private String textReserv1;

    @TableField("TEXT_RESERV2")
    private String textReserv2;

    @TableField("TEXT_RESERV3")
    private String textReserv3;

    @TableField("TEXT_RESERV4")
    private String textReserv4;

    @TableField("TEXT_RESERV5")
    private String textReserv5;

    @TableField("TIME_RESERV1")
    private Date timeReserv1;

    @TableField("TIME_RESERV2")
    private Date timeReserv2;

    @TableField("C_CUR_LOCATIOn")
    private String currentLocation;

    @TableField(value = "C_UPD_TIME",fill = FieldFill.UPDATE)
    private Date updateTime;

    @TableField("C_TYPE")
    private Integer cType;
}
