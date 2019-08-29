package com.zscat.pms.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 客户端首页轮播图
 */
@Setter
@Getter
@Accessors(chain = true)
public class SlideShowVO implements Serializable {
    private Integer storeId;
    private  String imgUrl;
}
