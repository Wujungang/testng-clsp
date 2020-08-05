package com.lhcf.SuiteTest;

import org.testng.annotations.*;

public class TestConfig {
    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("BeforeSuite 在该套件的所有测试都运行在注释的方法之前，仅运行一次。");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("AfterSuite 在该套件的所有测试都运行在注释方法之后，仅运行一次。");
    }

    @BeforeTest()
    public void testBeforeTest() {
        System.out.println("BeforeTest 注释的方法将在属于<test>标签内的类的所有测试方法运行之前运行。");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("AfterTest 注释的方法将在属于<test>标签内的类的所有测试方法运行之后运行。");
    }

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("BeforeClass 在调用当前类的第一个测试方法之前运行，注释方法仅运行一次。");
    }

    @AfterClass
    public void testAfterClass(){
        System.out.println("AfterClass 在调用当前类的第一个测试方法之后运行，注释方法仅运行一次");
    }
    @BeforeMethod(dependsOnMethods = "testMakeOrder")
    public void testBeforeMethod(){
        System.out.println("BeforeMethod " + "注释方法将在每个测试方法之前运行");
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod 注释方法将在每个测试方法之后运行。");
    }


}
