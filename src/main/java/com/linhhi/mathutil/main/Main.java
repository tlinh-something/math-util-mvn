/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.linhhi.mathutil.main;

import com.linhhi.mathutil.core.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test case #1 - xem chi tiết mô tả ở dưới (case n = 0 | 0!)
        int n = 0; //tình huống kiểm tra 0!
        long expected = 1; //0! hy vọng là 1, không cần lập trình cũng ra kết quả này
        long actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi hàm và run là biết ngay
        
        //so sánh giữa expected == actual hay không?
        System.out.println("0! --> expected = " + expected + " actual = " + actual);
        
        //Cách 1: kiểm thử = sức người: mắt nhìn, não nghĩ
        
        //test case #2 - mô tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! --> expected = " + expected + " actual = " + actual);
        
        
        //test case #3 - mô tả ở dưới
        //n = 5;
        //expected = 120;
        //actual = MathUtility.getFactorial(n);
        System.out.println("5! --> expected = 120" + " actual = " + MathUtility.getFactorial(5));
        
    }
    
    //Test case #3: Check getFactorial(n = 5)
    //STEPS/PROCEDURES:
    //          1. Given n = 5;
    //          2. Call/invoke getFactorial (n = 5)
    
    //EXPECTED RESULT
    //          the method returns 1 (standing for 5! = 120)
    
    //STATUS: PASSED/FAILED - tobe upated later, when finishing TEST RUN
    
    
    //Test case #2: Check getFactorial(n = 1)
    //STEPS/PROCEDURES:
    //          1. Given n = 1;
    //          2. Call/invoke getFactorial (n = 1)
    
    //EXPECTED RESULT
    //          the method returns 1 (standing for 1! = 1)
    
    //STATUS: PASSED/FAILED - tobe upated later, when finishing TEST RUN
    
    // DEV phải test code của mình
        //Cách 1: in kết quả xử lý ra màn hình
        
        //Nhắc lại: công việc của QC bao gồm
        //thiết kế test case, run test code, ghi lại bug nếu có
        //          test case, test run             log bug --> Jira, Bugzilla
        //test case: nói ra bạn sẽ test app thế nào
        //bằng cách đưa vào data, giá trị kì vọng, cách dùng app với bộ data đó
        //Lát rồi run thử app xem sao !! -> TEST RUN
        
        //ĐỀ THI PE LUÔN Ở ĐÂY !!! THIẾT KẾ TEST CASE
        //TA THIẾT KẾ TEST CASE ĐỂ TEST HÀM TÍNH GIAI THỪA
        //TEST CODE THÌ ĐƯỢC GỌI LÀ UNIT TEST
        //TEST CASE CHO UNIT TEST THÌ GỌI LÀ UNIT TEST CASE
        
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEPS/PROCEDURES:
        //          1. Given n = 0
        //          2. Invoke/call getFactorial(n = 0)
        
        //EXPECTED RESULT: the method return 1 stands for 0! = 1
        //Status         : passed/failed? --> lúc chạy hàm mới biết kết quả
        //                                    gọi là test run, có thể test đi test lại nhiều lần
    
}
