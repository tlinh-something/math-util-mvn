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
    
    //5! = 1.2.3.4.5 = 4! . 5
    // n! = n(n-1)! -> công thức đệ quy xuất hiện
    //đệ quy - recursion - gọi lại chính mình với quy mô nhỏ hơn
    
    public static long getFactorial (int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0 ... 20");
        
        if (n == 0 || n == 1)
             return 1; //nếu n đặc biệt ta return sớm luôn
        
        return n * getFactorial(n-1);
        
        //tối ưu code, thay ruột của hàm để chạy nhanh hơn, ngon hơn, hoặc code viết đẹp hơn
        //hoặc fix bug thì phải sửa code
        //dù bạn sửa code vì lý do gì, thì code cũng phải được test lại
        //và test lại để đảm bảo rằng nó vẫn xanh như lần trước
        //nếu ta viết code đi kèm test script thì việc test llaji cái hàm sẽ cực nhanh
        //không cần dùng mắt để dò từng dòng lệnh đíng sai , mà cjir nhìn màu xanh là đủ - vì hàm
        //trả về như expected test lại những gì đã từng test --> REGRESSION TEST (kiểm thử hồi quy)
        //kiểm thử lại hàm lúc này cực nhanh, vì github actions lo giùm
        //ta chỉ cần màu xanh, hoặc nhận email chửi vì code đỏ
    }
}
    
    
//    public static long getFactorial (int n){
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be 0 ... 20");
//        
//        if (n == 0 || n == 1)
//             return 1; //nếu n đặc biệt ta return sớm luôn
//        
//        long result = 1; //sống sót đến lệnh này sure n = 2..20
//        
//        for (int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//    }
//}
