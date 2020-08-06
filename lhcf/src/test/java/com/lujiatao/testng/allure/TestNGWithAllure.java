package com.lujiatao.testng.allure;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author wjg
 * @date 2020/8/6 22:33
 * @description
 */
public class TestNGWithAllure {
    @BeforeClass
    public void setUp() {
        System.out.println("setUp");
    }

    @Test(description = "测试用例_001描述（TestNG）")
    @Severity(SeverityLevel.CRITICAL)//Allure用例级别
    public void testCase_001() {
        System.out.println("testCase_001");
    }

    @Test
    @Description("测试用例_002描述（Allure）")
    @Severity(SeverityLevel.NORMAL)
    public void testCase_002() {
        System.out.println("testCase_002");
    }
}
