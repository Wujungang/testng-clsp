package com.lhcf.grouptest;


import org.testng.annotations.Test;

@Test(groups = "selenium-test")
public class TestSelenium {
    public void runSelenium() {
        System.out.println("runSelenium()999");
    }

    public void runSelenium1() {
        System.out.println("runSelenium()888");
    }

}
