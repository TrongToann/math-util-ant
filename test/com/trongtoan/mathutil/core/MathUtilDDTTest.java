package com.trongtoan.mathutil.core;

import static com.trongtoan.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.* ;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //1. chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với Expected và n 
    //                     dòng ứng với các test case 
    
    //mảng object, số thì dùng Wrapper class - class gói các primitive
    //Integer -> int, Long -> Long
    
    @Parameterized.Parameters
    public static Object[][] initData() {
//        int a[] = {5, 10, 15, 20, 25} ;    // liệt kê các phần tử mảng 
//        int b[][] = {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}} ;
        return new Integer[][] {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}} ;
    }
    //ta sẽ map/ánh xạ các cột của mỗi dòng, ví dụ dòng đầu tiên
    //có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến expected, 0 vào biến n
    //tương tự cho các dòng còn lại
    @Parameterized.Parameter(value = 0)
    public long expected ; //map vào cột 0 của mảng
    @Parameterized.Parameter(value = 1) 
    public int n ; //map vào cột 1 của mảng
    
    @Test //kiểm thử các test case với data dc trích ra từ mảng và map vào 2 biến
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));   
    }
}
//Phân tích cách ta viết code cho phần test 
//Các câu lệnh bị trộn lẫn, lệnh bị lặp đi lặp lại cho các data ta đưa vào
//để ta kiểm tra các tình huống xài hàm/test case 
//Lát hồi ta thay data thành các data tương ứng khác
//NẾU TA CÓ ĐƯỢC CÁCH NÀO ĐÓ, MÀ TA TÁCH ĐÁM DATA RA RIÊNG 1 CHỖ
//SAU ĐÓ TA NHỒI DATA NÀY VÀO CÂU LỆNH TEST HÀM Ở TRÊN 
//COI NHƯ CHỈ CẦN 1 LỆNH GỌI TEST HÀM, DATA CỨ THẾ TUẦN TỰ ĐẨY VÀO
//kĨ THUẬT ĐẨY TÁCH DATA RA KHỎI CÁC CÂU LỆNH TEST, SAU ĐÓ NHỒI NÓ VÔ 
//CÁI CÂU LỆNH TEST, GIÚP RÚT GỌN SỐ CÂU LỆNH TEST, GIÚP DỄ DÀNG KIỂM TRA TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
//KĨ THUẬT NÀY GỌI LÀ DDT - DATA DRVIEN TESTING
//VIẾT CODE KIỂM THỬ HƯỚNG THEO TÁCH DATA
//CÒN GỌI 1 TÊN KHÁC LÀ: KIỂM THỬ THEO KIỂU THAM SỐ HÓA - PARAMETERIZED
//Dấu ?? ở câu lệnh gọi hàm chính là tên biến sẽ dùng để nhận data từ data đã tách ra - CONVERT DATA THÀNH BIẾN
//TOÀN BỘ CODE TRONG CLASS NÀY DC VIẾT RA DÙNG ĐỂ TEST CODE CHÍNH Ở 
//BÊN SRC PACKAGES 
//CODE DC VIẾT RA DÙNG ĐỂ ĐI TEST CODE KHÁC
//THÌ CODE NÀY ĐC GỌI LÀ TEST SCRIPT
//1 TEST SCRIPT SẼ CHỨA NHIỀU CODE ĐỂ TEST HÀM CHÍNH
//1 TEST SCRIPT SẼ CHỨA NHIỀU TEST CASE - CÁC TÌNH HUỐNG XÀI HÀM
//1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ DỄ BẢO TRÌ CODE TEST 
//VIẾT CODE CHÍNH CÓ THỂ XÀI TDD


//Chơi với DDT ta cần
//Bộ data test - tách riêng 
//Các tham số ứng với bộ data - chính là các biến dùng trích data ra
//Gọi hàm kiểm thử xài các tham số
//static nằm im, ai cùng dũng dc, tạo new ra thì nằm nhiều chỗ muốn đụng phải có cầu nối gọi nó Student x 
//static vô là dùng
