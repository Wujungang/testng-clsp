package com.lhcf.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDBConnection {
    @Test
    public void runOtherTest1() {
        System.out.println("@Test - runOtherTest1");
    }

    @Test
    public void runOtherTest2() {
        System.out.println("@Test - runOtherTest2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("哦开始了");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("哦结束了");
    }


}
