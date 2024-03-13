import java.lang.reflect.Array;

import java.util.ArrayList;

public class QuanLiTaiKhoan {
    private ArrayList<TaiKhoan> dSTaiKhoan;
    Casino game = new Casino();

    public QuanLiTaiKhoan() {
        this.dSTaiKhoan = new ArrayList<>();
    }

    public QuanLiTaiKhoan(ArrayList<TaiKhoan> dSTaiKhoans) {
        this();
        this.dSTaiKhoan = dSTaiKhoans;
    }

    public void themTaiKhoan(TaiKhoan taiKhoanMoi) {
        if (kTraTenTaiKhoan(taiKhoanMoi.getTenTaiKhoan())) {
            System.out.println("ten nguoi dung da duoc su dung");
            System.out.println("vui long dat lai");
        } else {
            this.dSTaiKhoan.add(taiKhoanMoi);
            System.out.println("         dang ki thanh cong");
            System.out.println("choi lan dau nhan ngay 5 trieu, quá ngon");
        }
    }

    public boolean kTraTenTaiKhoan(String tenKiemTra) {
        if (dSTaiKhoan.size() >= 1) {
            for (TaiKhoan taiKhoan : dSTaiKhoan) {
                if (taiKhoan.getTenTaiKhoan().equals(tenKiemTra))
                    return true;
            }
        }
        return false;
    }

    public void dangNhap(String tenDangNhap, String matKhauDangNhap) {
        boolean dieuKien = true;
        for (TaiKhoan taiKhoan : dSTaiKhoan) {
            if (taiKhoan.getTenTaiKhoan().equals(tenDangNhap)) {
                if (taiKhoan.getMatKhau().equals(matKhauDangNhap)) {
                    System.out.println("        dang nhap thanh cong");
                    game.caCuoc(taiKhoan);
                    dieuKien = false;
                }
            }
            if (dieuKien)
                System.out.println("Ten tai khoan hoac mat khau khong hop le ");
        }
    }
}
