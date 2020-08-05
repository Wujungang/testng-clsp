package com.calis.clsp.DependOnTest;

import org.testng.annotations.Test;

public class App2 {

    @Test
    public void method1() {
        System.out.println("This is method 1");
        throw new RuntimeException();


    }

    @Test(dependsOnMethods = { "method1" })
    public void method2() {
        System.out.println("This is method 2");
    }


}
