package org.csu.coderlee.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author by bixi.lx
 * @created on 2018 05 31 23:37
 */
public class ResponseDataWrapper<T> implements Serializable {

    private static final long serialVersionUID = 7119063314369403485L;

    private String api_name;

    private Integer result;

    private Integer code;

    private String message;

    /**
     * 服务器查询时间
     */
    private Long qTime;

    private T data;

    public String getApi_name() {
        return cleanXSS(api_name);
    }

    public ResponseDataWrapper<T> setApi_name(String api_name) {
        this.api_name = api_name;
        return this;
    }

    public Integer getResult() {
        return result;
    }

    public ResponseDataWrapper<T> setResult(Integer result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseDataWrapper<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseDataWrapper<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public ResponseDataWrapper<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Long getQTime() {
        return qTime;
    }

    public ResponseDataWrapper<T> setQTime(Long qTime) {
        this.qTime = qTime;
        return this;
    }

    private String cleanXSS(String value) {
        if(StringUtils.isEmpty(value))
            return value;

        value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
        value = value.replaceAll("'", "&#39;");
        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        value = value.replaceAll("(?i)script", "");
        return value;
    }
}
