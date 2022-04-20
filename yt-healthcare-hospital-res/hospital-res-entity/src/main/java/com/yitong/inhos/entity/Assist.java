package com.yitong.inhos.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("YT_ASSIST")
public class Assist {
    private Long id;

    private String name;

    private String account;

    private String password;

    private String cellphone;

    private Date regTime;

    private Long AgencyID;

    private Long wxID;
}
