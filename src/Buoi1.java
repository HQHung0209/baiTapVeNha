public class Buoi1 {
    // function
    public static void main(String[] args) {
        /* // kiểu dữ liệu
        // String : kiểu chuỗi => 2 ký tự trở lên => "xin chào"
        // int : kiểu số nguyên => đại diện cho số => 3
        // float : kiểu số thực (số có phần thập phân 1.5) => 1.5
        // boolean : kiểu lý luận (1 : true ; 2 : false)

        // khai báo biến :
        // type variable = value

        String name = "Hoàng Quốc Hưng";
        // age = 21 (number)
        // address = Quận 11 (String)
        // isMale (boolean)
        // height : 1.78f;

        int age = 21;
        String address = "Biên Hòa - Đồng Nai";
        boolean isMale = true;
        float height = 1.78f;
        String myFavorite = "Bóng đá";

        System.out.println("Tên : " +name);
        System.out.println("tuổi : " +age);
        System.out.println("Địa chỉ :" +address);
        System.out.println("Chiều cao : " +height + " m");
        System.out.println("Sở thích : " +myFavorite); */

       /*    a += 1; // (a = a + 1)
             a++
             gán a trước
             sau đó a = a + 1
             int b = ++a;
             System.out.println("a " + a);
             System.out.println("b " + b); */

        /* int a = 5;
        int b = 6;
        //int ketQua = a++ - --b;
        int ketQua = ++a - --b - --a - b-- + a-- + b-- - b++;
        System.out.println("Ket qua : " +ketQua);
        System.out.println("a " +a);
        System.out.println("b " +b); */

        // dấu "/" lấy phần nguyên    dấu "%" chia lấy phần dư
        //        int a= 4;
        //        int b = a %2 ;
        //        System.out.println(b);

        //Câu điều kiện if else

        /* int age = 10 ;
        Nếu như tuổi dưới 18 : dưới vị thành niên
        Nếu như tuổi hơn 18 : trên vị thành viên

        if ( age < 18 ){
            System.out.println("Dưới vị thành niên");
        }else{
            System.out.println("Trên vị thường niên");
        } */

//        int a = 8;
//        int b = 6;
//         // a - b > 0; in 1
//         // a - b = 0; in 0
//         // a - b < 0; in -1
//        int ketQua = a- b;
//        if ( ketQua < 0 ){
//            System.out.println("-1");
//        }else if (ketQua == 0){
//            System.out.println("0");
//        }else{
//            System.out.println("1");
//        }

        int total = 500000;
        // nếu total >= 100k ==> giảm 10%
        // nếu total <  500k và lớn hơn 200k ==> giảm 15%
        // nếu total >= 500k ==> giảm 20%

        // type casting total = (int) (total * 0.8);

//        if ( total >=500000 ){
//            total = total * 80 / 100;
//            System.out.println("Tổng tiền sau khi giảm : " + total);
//        }else if ( total >= 200000 && total < 500000 ){
//            total = total * 85 / 100;
//            System.out.println("Tổng tiền sau khi giảm : " + total);
//        }else if ( total >= 100000 ){
//            total = total * 90 / 100;
//            System.out.println("Tổng tiền sau khi giảm : " + total);
//        }else {
//            System.out.println("Tổng tiền sau khi giảm : " + total);
//        }

//        String message = "";
//        if(total > 0 ){
//            if ( total > 500000){
//                message = "giảm 20%";
//                total = (int) (total * 0.8);
//            }else if( total >200000){
//                message = "giảm 15%";
//                total = (int) (total * 0.85);
//            }else if ( total >100000){
//                message = "giảm 10%";
//                total = (int) (total * 0.9);
//            }else{
//                message = " không đc giảm";
//            }
//        }else {
//            message = "dữ liệu sai";
//        }

//        int month = 2;
//        switch (month){
//            case 1 :
//            case 2 :
//            case 3 :
//                System.out.println("Quy 1");
//                break;
//            default:
//                System.out.println("Khong thuoc quy nao");
//                break;
//        }
    }



}
