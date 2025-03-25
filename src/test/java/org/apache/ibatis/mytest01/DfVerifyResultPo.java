package org.apache.ibatis.mytest01;

import java.util.Date;

import lombok.Data;

@Data
public class DfVerifyResultPo {

    private String id;

    private String type;

    private String result;

    private String item;

    private Date verifyTime;

    private String detailedResults;
}
