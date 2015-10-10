package com.zhw.validate;

import com.zhw.validate.annotation.Require;

/**
 * @author zhw
 * @version 0.1  15/10/10
 */
public class TestBean {

    @Require
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
