import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        QuanLiTaiKhoan dsTaiKhoan = new QuanLiTaiKhoan();
        String tenTaiKhoan;
        String matKhau;
        do {
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("     }           Ép88               {");
            System.out.println("     {        (1) dang ki           }");
            System.out.println("     {       (2) dang nhap          }");
            System.out.println("     }  nhan (so bat ki) de thoát   {");
            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("su lua chon cua ban la: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("     --------+-----------");
                    System.out.println("           DANG KI      ");
                    System.out.println("        Ten tai khoan   ");
                    System.out.print("------> ");
                    sc.nextLine();
                    tenTaiKhoan = sc.nextLine();
                    System.out.println("          Mat khau");
                    System.out.print("------> ");
                    matKhau = sc.nextLine();
                    System.out.println("     --------+-----------");
                    TaiKhoan taiKhoanMoi = new TaiKhoan(tenTaiKhoan, matKhau, 5000000);
                    dsTaiKhoan.themTaiKhoan(taiKhoanMoi);
                    break;
                case 2:
                    System.out.println("     --------+-----------");
                    System.out.println("        DANG NHAP");
                    System.out.println("      Ten tai khoan");
                    System.out.print("------> ");
                    sc.nextLine();
                    tenTaiKhoan = sc.nextLine();
                    System.out.println("        Mat khau");
                    System.out.print("------> ");
                    matKhau = sc.nextLine();
                    System.out.println("     --------+-----------");
                    dsTaiKhoan.dangNhap(tenTaiKhoan, matKhau);
                    break;
                default:
                    System.out.println("cam on ban quan tam, hen gap lai");
            }

        } while (luaChon <= 2);

    }
}
