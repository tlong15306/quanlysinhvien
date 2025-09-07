package ArrayList_with_ListStudients;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSachSinhVien;

    //nếu không truyền vào ta sẽ có 1 constructor rỗng
    public DanhSachSinhVien() {
        danhSachSinhVien = new ArrayList<>();
    }
    public void themSinhVien(SinhVien sv) {
        this.danhSachSinhVien.add(sv);
    }
}
