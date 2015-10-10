package com.zhw.validate;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhw
 * @version 0.1  15/10/10
 */
public class TestFileScanner {

    @Test
    public void TestRequirePass() throws Exception {


        TestBean testBean = new TestBean();
        testBean.setA("hehe");

        Assert.assertEquals(FieldScanner.validate(testBean), true);

    }

    @Test
    public void TestRequireFail() throws Exception {
        TestBean testBean = new TestBean();
        testBean.setB("hehe");

        Assert.assertEquals(FieldScanner.validate(testBean), false);
    }
}
