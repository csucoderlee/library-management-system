package org.csu.coderlee.utils;

import org.csu.coderlee.model.Book;

import java.lang.reflect.Field;

/**
 * @author by bixi.lx
 * @created on 2017 11 23 14:25
 * 根据domain数据来生成类似 <result property="sysSkuId" column="sys_sku_id" />
 */
public class ResultMapUtils {

    public static final char UNDERLINE='_';

    public static void main(String[] args) {

        // 只需要将参数换为对应的domain对象即可
        String[] filedName = getFiledName(new Book());
        for (String temp : filedName) {
//            System.out.println(temp);
//            System.out.println(camelToUnderline(temp));
            System.out.println(" <result property=\""+ temp+ "\" column=\"" + camelToUnderline(temp) +"\" />");
        }

    }
    /**
     * 获取属性名数组
     * */
    private static String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    public static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String underlineToCamel(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (c==UNDERLINE){
                if (++i<len){
                    sb.append(Character.toUpperCase(param.charAt(i)));
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
