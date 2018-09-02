package com.bus365.root.utils;

/**
 * redisKey设计
 */
public class RedisKeyUtil {

    public static String getKeyWithColumn(Class<?> model,String majorKey,String majorKeyValue,String column){
    	String tableName = model.getClass().getSimpleName();
        StringBuffer buffer = new StringBuffer();
        buffer.append(tableName).append(":");
        buffer.append(majorKey).append(":");
        buffer.append(majorKeyValue).append(":");
        buffer.append(column);
        return buffer.toString();
    }
    
    public static String getKey(Object model,String majorKey,String majorKeyValue){
    	String tableName = model.getClass().getSimpleName();
        StringBuffer buffer = new StringBuffer();
        buffer.append(tableName).append(":");
        buffer.append(majorKey).append(":");
        buffer.append(majorKeyValue).append(":");
        return buffer.toString();
    }
}