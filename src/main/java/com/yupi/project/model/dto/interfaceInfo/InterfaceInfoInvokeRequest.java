package com.yupi.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口调用请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;


    /**
     * 请求体
     */
    private String userRequestParams;


}