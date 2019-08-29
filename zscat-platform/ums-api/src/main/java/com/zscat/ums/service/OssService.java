package com.zscat.ums.service;

import javax.servlet.http.HttpServletRequest;

import com.zscat.common.result.OssCallbackResult;
import com.zscat.common.result.OssPolicyResult;

/**
 * oss上传管理Service 
 */
public interface OssService {
    OssPolicyResult policy();

    OssCallbackResult callback(HttpServletRequest request);
}
