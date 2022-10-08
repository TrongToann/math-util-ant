/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trongtoan.mathutil.core;

/**
 *
 * @author DELL
 */
//đây là class mô phòng lại các hàm tiện ích/dùng chung cho mọi
//class khác, mô phỏng lại class tiện ích java.Math cua JDK
//Phàm cái gì là dồ dùng thường dc thiết kế là static 
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //hàm tiện ích tính n! = 1.2.3.4.5
    //lưu ý/quy ước: 
    //- Không tính giai thừa của số âm!!
    // 0! = 1! = 1
    //Vì giai thừa tăng cực nhanh nên 21! đã vượt 18 sô 0 -> tràn long -> ta không tính 21! trờ lên
    public static final long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");

        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // sống sót đến đât, sure n = 2..20!! 
        //CẤM KO SÀI ELSE KHI HÀM ĐÃ CÓ RETURN PHÍA TRƯỚC
        long product = 1; // biến cộng dồn, nhân dồn, biến con heo đất (accumulation/ gửi góp)
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
//CODING CONVENTION : quy tắc viết code cty đưa đẻ ép phải theo !!!
// TA HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT LẬP TRÌNH/ ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG 
// CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/ PHÁT HIỆN BUG SỚM
// TDD yêu cầu dev khi viết code/viết hàm phải viết luôn 
// các bộ kiểm thử/ viết luôn các test case/ viết luôn các đoạn code dùng thử hàm để kiểm tra tính đúng đắn của hàm/class

// viết code kèm với viết test cases
// viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//  developmen  driven                   test
// SAU KHI CÓ DC TÊN HÀM, VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM 
// CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
// SAU ĐÓ TA TỐI ƯU CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE ĐÚNG
// QUÁ TRÌNH SAI - ĐÚNG - SAI diễn ra liên tục (cycle)
