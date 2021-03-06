package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;


public class NumberDeserializerTest extends TestCase {
    public void test_byte() throws Exception {
        Assert.assertEquals(Byte.valueOf((byte) 123), JSON.parseObject("\"123\"", byte.class));
        Assert.assertEquals(Byte.valueOf((byte) 123), JSON.parseObject("\"123\"", Byte.class));
    }
    
    public void test_byte1() throws Exception {
        Assert.assertEquals(Byte.valueOf((byte) 123), JSON.parseObject("123.", byte.class));
        Assert.assertEquals(Byte.valueOf((byte) 123), JSON.parseObject("123.", Byte.class));
    }
    
    public void test_short() throws Exception {
        Assert.assertEquals(Short.valueOf((short) 123), JSON.parseObject("\"123\"", short.class));
        Assert.assertEquals(Short.valueOf((short) 123), JSON.parseObject("\"123\"", Short.class));
    }
    
    public void test_short1() throws Exception {
        Assert.assertEquals(Short.valueOf((short) 123), JSON.parseObject("123.", short.class));
        Assert.assertEquals(Short.valueOf((short) 123), JSON.parseObject("123.", Short.class));
    }
}
