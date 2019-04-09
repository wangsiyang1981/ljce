package com.service.ljceshi1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLjceshi1 {

        Ljceshi1Delegate ljceshi1Delegate = new Ljceshi1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ljceshi1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}