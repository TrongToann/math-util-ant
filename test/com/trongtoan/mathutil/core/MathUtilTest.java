package com.trongtoan.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest { 
        //Ta đi test ngoại lệ, tức là so sánh xem ngoại lệ có xuất hiện hay không 
        //thay vì so sánh expected values vs actual values 
        //lúc này ta sẽ đi so sánh ước lượng xem ngoại lệ có xuất hiện như kỳ vọng hay không 
        //nêu xuất hiện như kỳ vọng => sure hàm ngon 
        //nếu ngoại lệ xuất hiện như kỳ vọng => màu xanh
        //Vì hàm đúng như thiết kế
        @Test
        public void testFactorialGivenRightArgumentReturnsWell2() {
            //Test case số #4: n = 3, hy vọng hàm trả về 6, thực tế ???
            Assert.assertEquals(6, MathUtil.getFactorial(3)) ;
            //Test case số #5: n = 4, hy vọng hàm trả về 24, thực tế ???
            Assert.assertEquals(24, MathUtil.getFactorial(4)) ;
            //Test case số #6: n = 5, hy vọng hàm trả về 120, thực tế ???
             Assert.assertEquals(120, MathUtil.getFactorial(5)) ;
        }
        //QUY TẮC XANH ĐỎ:
        //* MÀU XANH KHI TẤT CẢ CÁC TEST CASE PHẢI CÙNG MÀU XANH, TỨC LÀ EXPECTED == ACTUAL 
        //CHO TẤT CẢ CÁC TÌNH HUỐNG TEST
        
        // MÀU ĐỎ CHỈ CẦN 1 TRONG NHỮNG TEST CASE EPXECTED != ACTUAL => FAIL
        // ý NGHĨA CỦA QUY TẮC: NẾU DÃ TEST, NẾU ĐÃ LIỆT KÊ CÁC TEST CASE THÌ CHÚNG PHẢI ĐÚNG HẾT, CÒN CHỈ CẦN 1 THẰNG SAI, HÀM KO ỔN ĐỊNH => FAIL
        // EXPECTED == ACTUAL CASE ĐÚNG, TEST CASE PASSED
        // EXPECTED != ACTUAL -> CASE FAILED
        //        NẾU EXPECTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÍ SAI, BUG
        //        CŨNG CÓ KHI EXPECTED, CÁI TA KÌ VỌNG BỊ SAI!!! LỖI DO DÂN QC TÍNH TOÁN
        @Test //coding convention: quy tắc viết code, tên hàm kiểm thử/tên hàm của test script
              //phải nói lên ý nghĩa của việc kiểm thử 
              //tình huống này ta muốn test hàm getF tham số tư tế
              //n = 0...20!!!
        public void testFactorialGivenRightArgumentReturnsWell() {
            //Test case số #1: n = 0, hy vọng hàm trả về 1
            //                        thực tế hàm trả về mấy, đoán xem!!!
            long expected = 1 ; 
            long actual = MathUtil.getFactorial(0) ; 
              //so sánh giữa expected và actual, máy tự so cho màu là đủ
            Assert.assertEquals(expected, actual) ; 
            //Test case số #2: n = 1, hy vọng hàm trả về 1, thực tế ???
            Assert.assertEquals(1, MathUtil.getFactorial(1)) ;
            //Test case số #3: n = 2, hy vọng hàm trả về 2, thực tế ???
            Assert.assertEquals(2, MathUtil.getFactorial(2)) ;
        }
        @Test
        // -> ra lệnh cho thư viện junit mình đã add
        //tự động generate ra cái hàm public static void main
        //biến cái hàm tryJUnitComparison() thành hàm main
        //và gửi hàm main này cho JVM chạy
        //tương đương Main , k có @Test thì class k có min -> no runable method
        
        public void tryJUnitComparison() { 
            //hàm này thử nghiệm việc so sánh expected vs actual 
            //coi sai đúng ra màu thế nào
            //ta đang xài hàm của thư viện JUnit nhưng k xài bừa bãi mà phải viết theo quy tác định trước
            //quy tác định trước nằm ở @ - annotation
            Assert.assertEquals(101, 101) ;
    } 
        @Test(expected = Exception.class) 
         public void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm đc thiết kế ném về ngoại lệ!!
        //Thấy ngoại lệ mừng rơi rước mắt khi đưa vào -5
        //Thấy ngoại lệ xuất hiện như kỳ vọng -> passed cái test => màu xanh
        System.out.println("Hope to see the Expected| Illegal Argument Exception"); 
        MathUtil.getFactorial(-5) ; 
    }
         
         
         
    
}
//CLASS này dev sẽ viêt những câu lệnh dùng để test hàm 
//CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL 
//TRONG CLASS NÀY SẼ CÓ NHỮNG LỜI GỌI HÀM getFactorial()
//CÓ NHỮNG CÂU LỆNH SO SÁNH GIỮA EXPECTED VÀ ACTUAL 
//GIỐNG GIỐNG MÌNH ĐÃ LÀM TEST Ở BÊN MAIN NHƯNG KHÁC Ở CHỖ MÀU SẮC
//MẮT GIỜ CHỈ NHÌN 2 MÀU XANH ĐỎ
//MUỐN CÓ ĐƯỢC ĐIỀU NÀY TA SẼ DÙNG THÊM CÁC UNIT TESTING FRAMEWORK
//VÍ DỤ: JUnit, TestNG (Java) 
//       xUnit, MSTest, NUnit 
//       PHPUnit
//       ...
//VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING
//ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK
//ĐỂ KIỂM THỬ HÀM CỦA CODE CHÍNH
//ĐOẠN CODE KIỂM THỬ NÀY ĐƯỢC GỌI LÀ: TEST SCRIPT
//CODE DÙNG ĐỂ TEST CODE (CHÍNH) GỌI LÀ TEST SCRIPT 
//TEST SCRIPT LÀ CÁC ĐOẠN CODE ĐC VIẾT RA ĐỂ TEST CODE CHÍNH(DAO, DTO, CONTROLLER, API,...) 
//MUỐN TEST CẦN PHẢI PHÁC THẢO CÁC TEST CASE
//TEST SCRIPT SẼ SỬ DỤNG CÁC TEST CASE
//VÍ DỤ: VIẾT CODE ĐỂ TEST HÀM getFactorial() VỚI TEST CASE 