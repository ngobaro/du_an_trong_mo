import java.util.Locale;
import java.util.Scanner;

public class Casino extends TaiKhoan {
    public void caCuoc(TaiKhoan tK) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        int tienCuoc;
        int[] nguoiChoi = new int[52];
        int[] nhaCai = new int[52];
        Locale lc = new Locale("vi", "VN");
        /*
         * System.out.println(" _________________________________");
         * System.out.println("|                 ______________  |");
         * System.out.println("|                | THE PROGRAM  | |");
         * System.out.println("|                |IS MADE BY BAO| |");
         * System.out.println("|         ____   | _____________| |");
         * System.out.println("|        (0__0)  |/               |");
         * System.out.println("|         )  (                    |");
         * System.out.println("|     //(  )(  )\\                 |");
         * System.out.println("|    //  )____(  \\                |");
         * System.out.println("|___//__(______)__\\_______________|");
         * System.out.println();
         */
        System.out.println("SO TIEN TRONG TAI KHOAN " + tK.getTenTaiKhoan() + ": " + tK.getTienAo());
        do {
            if (tK.getTienAo() == 0)
                System.out.println("ban het tien yeu cau nap them");
            System.out.println(" _________________WELCOME TO Ép88__________________");
            System.out.println("|                   (1) xi zach                   |");
            System.out.println("|                   (2) bai cao                   |");
            System.out.println("|                   (3) bau cua                   |");
            System.out.println("|                   (4) tai xiu                   |");
            System.out.println("|                   (5) nap tien       ___        |");
            System.out.println("|              so (bat ki) dangxuat --|->_|       |");
            System.out.println("|_________________________________________________|");
            System.out.print("lua chon cua ban la: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("        ~~~~~~~~~~~~~~~~~~");
                    System.out.println("        }   GAME XI ZACH  {");
                    System.out.println("        {     BAT DAU     }");
                    System.out.println("        ~~~~~~~~~~~~~~~~~~");
                    // dat cuoc
                    do {
                        System.out.print("So tien ban muon dat cuoc: ");
                        tienCuoc = sc.nextInt();
                        if (tienCuoc <= 0 || tienCuoc > tK.getTienAo()) {
                            System.out.println("tien cuoc khong duoc duoi 0 hoac tai khoan ban het tien");
                        }
                        if (tK.getTienAo() == 0) {
                            System.out.println("vui long nap tien");
                        }
                        if (tienCuoc <= 99999)
                            System.out.println("/!\tien cuoc phai tu 100.000 tro len");
                    } while (tienCuoc <= 99999 || tienCuoc > tK.getTienAo());
                    // game xi
                    XiZach xZach = new XiZach();
                    xZach.chiaBai();
                    // chia bài
                    String luaChon2;
                    sc.nextLine();
                    do {
                        System.out.println("bài nhà cái");
                        xZach.haiLaAn();
                        System.out.println("------------------+------------------");
                        System.out.println("bai cua ban");
                        xZach.hienThiLaNguoiChoi();
                        System.out.println("     __________________");
                        System.out.println("    |    (d) de dan    |");
                        System.out.println("    |    (r) de rut    |");
                        System.out.println("    |__________________|");
                        System.out.print("------->");
                        luaChon2 = sc.nextLine();
                    } while (xZach.rut_dan(luaChon2));
                    xZach.rut_DanCai();
                    System.out.println("BAI CAI");
                    xZach.hienThiLaBaiCai();
                    System.out.println("------------------+------------------");
                    System.out.println("BAI NGUOI CHOI");
                    xZach.hienThiLaNguoiChoi();

                    if (xZach.tinhTien(tienCuoc) == 0) {
                        System.out.println("         ~~ hoà ~~");
                    } else if (xZach.tinhTien(tienCuoc) == tienCuoc) {
                        System.out.println("         ~~ ban thang ~~");
                    } else {
                        System.out.println("         ~~ nha cai thang~~");
                    }
                    tK.setTienAo(tK.getTienAo() + xZach.tinhTien(tienCuoc));
                    System.out.println("so tien hien tai: " + tK.getTienAo());

            }

        } while (luaChon <= 5);
    }

}
