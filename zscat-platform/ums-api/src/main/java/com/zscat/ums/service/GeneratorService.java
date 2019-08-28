/**
 * 
 */
package com.zscat.ums.service;

import java.util.List;
import java.util.Map;

/**
 * 生成代码
 */ 
public interface GeneratorService {
	List<Map<String, Object>> list(); 
	byte[] generatorCode(String[] tableNames);
}
