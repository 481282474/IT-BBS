package com.lyc.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * QQ登录DTO
 *
 * @author 刘怡畅
 * @date 2023/04/06 23:30
 **/
@Data
public class QqLoginDTO {

    /**
     * openId
     */
    @NotBlank(message = "openId不能为空")
    private String openId;

    /**
     * accessToken
     */
    @NotBlank(message = "accessToken不能为空")
    private String accessToken;
}