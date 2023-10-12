/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.linhhi.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    
    @Test //dính đến thuật ngữ framework
    
    //TEST CASE TEMPLATES/STRUCTURE:
    //ID | DESC | STEP/PROCEDUCES | EXPECTED VALUE | STATUS (PASSED/FAILED)
    
    //Test case #1: Verify the getFactorial() function with n = 0
    //Step/proceduces:
    //          1. Given n = 0
    //          2. Call/invoke getFactorial(int n)
    //Expected Result
    //          The method getFactorial(n = 0) must return 1 
    //                          as the return of 0! == 1
    //STATUS: PASSED/FAILED đoán xem khi chạy app/hàm/method
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test case #2: Verify the getFactorial() function with n = 1
    //Step/proceduces:
    //          1. Given n = 1
    //          2. Call/invoke getFactorial(int n)
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    
    //Test case #3:
    @Test
    public void verifyFactorialGivenRightArgument6ReturnsOk(){
        assertEquals(720, MathUtility.getFactorial(6));
    }
}
