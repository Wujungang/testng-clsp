package com.lhcf.login;

import org.testng.annotations.Test;

public class TestTimeout {
    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail() {
//        while (true){
//            // do nothing
//        }
        System.out.println("123");

    }
}
