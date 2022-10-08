/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.trongtoan.mathutil.main;

//import com.trongtoan.mathutil.core.MathUtil;

import com.trongtoan.mathutil.core.MathUtil;


/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement comes from the main() method");
        tryTDDFirst(); 
        //testFactorialGivenWrongArgumentThrowsException(); 
    }
    //hàm này được viết ra để dùng thử kĩ thuật viết code kiểu TDD
    //gọi thử/dùng thử hàm chính bên core
    //xem nó sai đúng ra sao, ở ngay mức khởi đầu viết code
    public static void tryTDDFirst() {
        //Test case #1 (tình huống kiểm thử hàm số 1)
        //input: n = 1 ; 
        //Gọi hàm getFactorial(1)
        long expected = 1 ; 
        long actual = MathUtil.getFactorial(1); 
       //so sánh expected vs actual coi chúng giống nhau hem? 
       //giống -> hàm đúng với case đang test
       //sai -> bug
       //Hy vọng hàm trả về 1 vì 1! = 1
        System.out.println("Test 1!  |  status: "          
                  +" | Expected: " + expected +
                   " | Actual: " + actual);
        
        
        //Test case #2 (tình huống kiểm thử hàm số 2)
        //input: n = 2 ; 
        //Gọi hàm getFactorial(2)
        //Hy vọng hàm trả về 2 vì 2! = 2
       //so sánh expected vs actual coi chúng giống nhau hem? 
       //giống -> hàm đúng với case đang test
       //sai -> bug
        System.out.println("Test 2!  |  status: "          
                  +" | Expected: " + 2 +
                   " | Actual: " + MathUtil.getFactorial(2)); 
    }
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm đc thiết kế ném về ngoại lệ!!
        //Thấy ngoại lệ mừng rơi rước mắt khi đưa vào -5
        //Thấy ngoại lệ xuất hiện như kỳ vọng -> passed cái test => màu xanh
        System.out.println("Hope to see the Expected| Illegal Argument Exception"); 
        MathUtil.getFactorial(-5) ; 
    }
}
//Test case là 1 tình huống xài kiểm thử app/ kiểm thử tính năng/ màn hình 
//chức năng/ xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà khi đó
//ta ohair đưa vào data giả/mẫu sau đó chờ hàm/ tính năng
//xử lí xong trả về 
//nhìn kết quả và so sánh với kì vọng đã ghi ra trước 
//tính năng ổn => test case Passed 
//                Test case Failed