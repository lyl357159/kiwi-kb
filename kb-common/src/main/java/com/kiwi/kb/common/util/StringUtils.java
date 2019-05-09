package com.kiwi.kb.common.util;

/**
 * Created by liulu on 2019/5/9.
 */
public class StringUtils {

    public static Integer strToIntDef(String value, Integer def){
        try {
            return  Integer.parseInt(value);
        } catch (NumberFormatException e) {
           return def;
        }
    }
}
