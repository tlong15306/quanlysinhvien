package ArrayList_with_ListStudients;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XuLyTen xt = new XuLyTen();
        DanhSachSinhVien ds = new DanhSachSinhVien();//có 1 arraylist rong
        int chon;
        do {
            System.out.println("MENU__________");
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên vào danh sách.");
            System.out.println("2. In danh sách sinh viên ra màn hình.");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không.");
            System.out.println("4. Lấy ra số lượng sinh viên trong danh sách.");
            System.out.println("5. Làm rỗng danh sách sinh viên.");
            System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
            System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
            System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
            System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
            System.out.println("0. Thoát khỏi chương trình.");
            System.out.print("Vui lòng chọn chức năng: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:{
                    System.out.println("Nhap vao mã sinh vien: ");
                    int msv = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap vao ten sinh vien: ");
                    String tsv = sc.next();
                    tsv=tsv.trim();//loại bỏ khoảng trắng



                    SinhVien sv = new SinhVien(new HoVaTen( ));
                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:

            }


        }while(chon != 0);
    }
}
