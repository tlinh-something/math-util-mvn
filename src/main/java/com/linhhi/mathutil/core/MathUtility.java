/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.linhhi.mathutil.core;

/**
 *
 * @author DELL
 */

//class này chứa các hàm  static dùng chung cho mọi nơi
//khi nào dùng static: khi ta làm các hàm mà chỉ xử lý xong rồi return
//không cần lưu trữ lại thông tin vào instance variable - đặc tính của object
public class MathUtility {
    public static final double PI = 3.14;
    
    //Hàm tính n! = 1.2.3.....(n-1)
    //không tính được gia thừa số âm
    // 0! = 1
    //vì giai thừa tăng rất nhanh, 21! kiểu long chứa không nổi (vượt 18 số 0)
    //do đó hàm getF() của chúng ta chỉ chơi với n<=20
    public static long getFactorial (int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0 ... 20");
        
        if (n == 0 || n == 1)
             return 1; //nếu n đặc biệt ta return sớm luôn
        
        long result = 10; //sống sót đến lệnh này sure n = 2..20
        
        for (int i = 2; i <= n; i++)
            result *= i;
        
        return result;
    }
}
