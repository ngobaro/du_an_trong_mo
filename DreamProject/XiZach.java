import java.util.Random;

public class XiZach {

    private int soLabaiNguoiChoi;
    private int soLabaiNhaCai;

    private int[] laBaiNguoiChoi = new int[52];
    private int[] laBaiNhaCai = new int[52];

    public XiZach() {
    }

    public XiZach(int laBai, int soLabaiNguoiChoi, int soLabaiNhaCai, int[] laBaiNguoiChoi, int[] laBaiNhaCai) {
        this.soLabaiNguoiChoi = soLabaiNguoiChoi;
        this.soLabaiNhaCai = soLabaiNhaCai;
        this.laBaiNguoiChoi = laBaiNguoiChoi;
        this.laBaiNhaCai = laBaiNhaCai;
    }

    public int getSoLabaiNguoiChoi() {
        return soLabaiNguoiChoi;
    }

    public void setSoLabaiNguoiChoi(int soLabaiNguoiChoi) {
        this.soLabaiNguoiChoi = soLabaiNguoiChoi;
    }

    public int getSoLabaiNhaCai() {
        return soLabaiNhaCai;
    }

    public void setSoLabaiNhaCai(int soLabaiNhaCai) {
        this.soLabaiNhaCai = soLabaiNhaCai;
    }

    public int[] getLaBaiNguoiChoi() {
        return laBaiNguoiChoi;
    }

    public void setLaBaiNguoiChoi(int[] laBaiNguoiChoi) {
        this.laBaiNguoiChoi = laBaiNguoiChoi;
    }

    public int[] getLaBaiNhaCai() {
        return laBaiNhaCai;
    }

    public void setLaBaiNhaCai(int[] laBaiNhaCai) {
        this.laBaiNhaCai = laBaiNhaCai;
    }

    // chia bài xì dách mỗi bên có 2 lá
    public void chiaBai() {
        Random laBai = new Random();
        setSoLabaiNguoiChoi(2);
        setSoLabaiNhaCai(2);
        for (int i = 0; i < 2; i++) {
            laBaiNguoiChoi[i] = laBai.nextInt(12) + 1;
        }

        for (int i = 0; i < 2; i++) {
            laBaiNhaCai[i] = laBai.nextInt(12) + 1;
        }

    }

    // xem bài cua nhà cái
    public void hienThiLaBaiCai() {
        for (int i = 0; i < getSoLabaiNhaCai(); i++) {
            System.out.print(" ______         ");
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNhaCai(); i++) {
            if (laBaiNhaCai[i] == 10) {
                System.out.print("|10    |        ");
            } else if (laBaiNhaCai[i] == 11) {
                System.out.print("|J     |        ");
            } else if (laBaiNhaCai[i] == 12) {
                System.out.print("|Q     |        ");
            } else if (laBaiNhaCai[i] == 13) {
                System.out.print("|K     |        ");
            } else if (laBaiNhaCai[i] == 1) {
                System.out.print("|A     |        ");
            } else {
                System.out.print("|" + laBaiNhaCai[i] + "     |        ");
            }
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNhaCai(); i++) {
            System.out.print("|      |        ");
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNhaCai(); i++) {
            System.out.print("|      |        ");
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNhaCai(); i++) {
            if (laBaiNhaCai[i] == 10) {
                System.out.print("|____10|        ");
            } else if (laBaiNhaCai[i] == 11) {
                System.out.print("|_____J|        ");
            } else if (laBaiNhaCai[i] == 12) {
                System.out.print("|_____Q|        ");
            } else if (laBaiNhaCai[i] == 13) {
                System.out.print("|_____K|        ");
            } else if (laBaiNhaCai[i] == 1) {
                System.out.print("|_____A|        ");
            } else {
                System.out.print("|_____" + laBaiNhaCai[i] + "|        ");
            }
        }
        System.out.println();
        System.out.println("so diem nha cai dang la: " + tinhTongNut(soLabaiNhaCai, laBaiNhaCai));
    }

    // xem bài người chơi
    public void hienThiLaNguoiChoi() {
        for (int i = 0; i < getSoLabaiNguoiChoi(); i++) {
            System.out.print(" ______         ");
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNguoiChoi(); i++) {
            if (laBaiNguoiChoi[i] == 10) {
                System.out.print("|10    |        ");
            } else if (laBaiNguoiChoi[i] == 11) {
                System.out.print("|J     |        ");
            } else if (laBaiNguoiChoi[i] == 12) {
                System.out.print("|Q     |        ");
            } else if (laBaiNguoiChoi[i] == 13) {
                System.out.print("|K     |        ");
            } else if (laBaiNguoiChoi[i] == 1) {
                System.out.print("|A     |        ");
            } else {
                System.out.print("|" + laBaiNguoiChoi[i] + "     |        ");
            }
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNguoiChoi(); i++) {
            System.out.print("|      |        ");
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNguoiChoi(); i++) {
            System.out.print("|      |        ");
        }
        System.out.println();
        for (int i = 0; i < getSoLabaiNguoiChoi(); i++) {
            if (laBaiNguoiChoi[i] == 10) {
                System.out.print("|____10|        ");
            } else if (laBaiNguoiChoi[i] == 11) {
                System.out.print("|_____J|        ");
            } else if (laBaiNguoiChoi[i] == 12) {
                System.out.print("|_____Q|        ");
            } else if (laBaiNguoiChoi[i] == 13) {
                System.out.print("|_____K|        ");
            } else if (laBaiNguoiChoi[i] == 1) {
                System.out.print("|_____A|        ");
            } else {
                System.out.print("|_____" + laBaiNguoiChoi[i] + "|        ");
            }
        }
        System.out.println();
        System.out.println("so diem nguoi choi dang la: " + tinhTongNut(soLabaiNguoiChoi, laBaiNguoiChoi));
    }

    // những lá bài đặc biệt như J(11) Q(12) K(13) được tính là 10 điểm
    public int tinhNut(int diem) {
        if (diem > 10) {
            diem -= diem % 10;
        }
        return diem;
    }

    // kiểm tra trùng đẻ số lượng bài phát ra không được quá 4 con : bích chuồn rô
    // cơ
    public boolean ktraTrungLabai(int diem) {
        int dem = 0;
        for (int i = 0; i < getSoLabaiNguoiChoi(); i++) {
            if (diem == laBaiNguoiChoi[i])
                dem++;
        }
        for (int i = 0; i < getSoLabaiNhaCai(); i++) {
            if (diem == laBaiNhaCai[i])
                dem++;
        }
        return dem < 4;
    }

    // 2 hiển thị lá chưa khưa
    public void haiLaAn() {
        System.out.println("  ______          ______");
        System.out.println(" |//////|        |//////|");
        System.out.println(" |//////|        |//////|");
        System.out.println(" |//////|        |//////|");
        System.out.println(" |_////_|        |_////_|");

    }

    // rút bài hay dằn của người
    public boolean rut_dan(String luaChon2) {
        boolean dieuKien = true;
        int tongNut = tinhTongNut(soLabaiNguoiChoi, laBaiNguoiChoi);
        if (tongNut <= 21) {
            switch (luaChon2) {
                case "d":
                    if (laBaiNguoiChoi[0] >= 10 && laBaiNguoiChoi[1] == 1
                            || laBaiNguoiChoi[0] == 1 && laBaiNguoiChoi[1] >= 10) {
                        dieuKien = false;
                        break;
                    }
                    if (laBaiNguoiChoi[0] == 1 && laBaiNguoiChoi[1] == 1) {
                        dieuKien = false;
                        break;
                    }
                    if (tongNut < 16) {
                        System.out.println("ban phai tren 16 nut de dan");
                    } else {
                        System.out.println("       ______________");
                        System.out.println("      |  ban da dan  |");
                        if (tongNut == 16) {
                            System.out.println("      |  dan do quá ní  |");
                        }
                        System.out.println("      |______________|");
                        dieuKien = false;
                    }

                    break;
                case "r":
                    System.out.println("ban da rut");
                    Random laBai = new Random();
                    do {
                        laBaiNguoiChoi[getSoLabaiNguoiChoi()] = laBai.nextInt(12) + 1;
                    } while (!ktraTrungLabai(laBaiNguoiChoi[getSoLabaiNguoiChoi()]));

                    setSoLabaiNguoiChoi(getSoLabaiNguoiChoi() + 1);
                    break;
            }
        } else {
            System.out.println("       ______________");
            System.out.println("      |   ban da bù  |");
            System.out.println("      |    leu leu   |");
            System.out.println("      |______________|");
            dieuKien = false;
        }
        return dieuKien;
    }

    // tinh tổng nút trên tất cả lá bài của phe(cái hay người chơi)
    public int tinhTongNut(int soLaBai, int[] laBai) {
        int tongNut = 0;
        for (int i = 0; i < soLaBai; i++) {
            tongNut += tinhNut(laBai[i]);
        }
        return tongNut;
    }

    // hàm để cái đủ điểm
    public int rut_DanCai() {
        int tongNutCai = tinhTongNut(soLabaiNhaCai, laBaiNhaCai);
        if (laBaiNhaCai[0] < 10 && laBaiNhaCai[1] != 1 || laBaiNhaCai[0] != 1 && laBaiNhaCai[1] < 10) {
            if (laBaiNhaCai[0] != 1 && laBaiNhaCai[1] != 1) {
                do {
                    if (tongNutCai < 15) {
                        Random laBai = new Random();
                        do {
                            laBaiNhaCai[getSoLabaiNhaCai()] = laBai.nextInt(12) + 1;
                        } while (!ktraTrungLabai(laBaiNhaCai[getSoLabaiNhaCai()]));
                        setSoLabaiNhaCai(getSoLabaiNhaCai() + 1);
                        System.out.println("so la bai cai: " + getSoLabaiNguoiChoi());
                    }
                } while (tongNutCai >= 15 && soLabaiNhaCai == 5);
            }
        }
        return tongNutCai;
    }

    // hàm trả tính theo luật xì dách đẻ trả về dư liệu thanh toán
    public int tinhTien(int tienCuoc) {
        int tongNutCai = tinhTongNut(soLabaiNhaCai, laBaiNhaCai);
        int tongNutNguoiChoi = tinhTongNut(soLabaiNguoiChoi, laBaiNguoiChoi);

        // trường hợp nhà cái xì bàn
        if (laBaiNhaCai[0] == 1 && laBaiNhaCai[1] == 1) {
            if (laBaiNguoiChoi[0] == 1 && laBaiNguoiChoi[1] == 1) {
                return 0;
            } else {
                return -2 * tienCuoc;
            }
        }
        // trường hợp nếu người chơi xì bàn mà cái không có
        if (laBaiNhaCai[0] == 1 && laBaiNhaCai[1] == 1)
            return 2 * tienCuoc;

        // trường hợp nhà cái xi dách
        if (laBaiNhaCai[0] >= 10 && laBaiNhaCai[1] == 1 || laBaiNhaCai[1] >= 10 && laBaiNhaCai[0] == 1) {
            if (laBaiNguoiChoi[0] >= 10 && laBaiNguoiChoi[1] == 1
                    || laBaiNguoiChoi[1] >= 10 && laBaiNguoiChoi[0] == 1) {
                return 0;
            } else {
                return -1 * tienCuoc;
            }
        }
        // trường hợp nếu người xì zách mà cái không có
        if (laBaiNguoiChoi[0] >= 10 && laBaiNguoiChoi[1] == 1 || laBaiNguoiChoi[1] >= 10 && laBaiNguoiChoi[0] == 1) {
            return tienCuoc;
        }
        // trường hợp nhà cái ngũ linh
        if (soLabaiNhaCai == 5 && tongNutCai <= 21) {
            if (soLabaiNguoiChoi == 5 && tongNutNguoiChoi <= 21 && tongNutNguoiChoi == tongNutCai) {
                return 0;
            } else if (soLabaiNguoiChoi == 5 && tongNutNguoiChoi <= 21 && tongNutNguoiChoi < tongNutCai) {
                return tienCuoc;
            } else {
                return -1 * tienCuoc;
            }
        }
        // trường hợp người chơi ngũ linh mà nhà cái không có
        if (soLabaiNguoiChoi == 5 && tongNutNguoiChoi <= 21) {
            return tienCuoc;
        }

        // trường hợp lớn bé bù và người chơi bù quá 28
        if (tongNutCai <= 21 && tongNutNguoiChoi <= 21) {
            if (tongNutCai == tongNutNguoiChoi) {
                return 0;
            } else if (tongNutCai > tongNutNguoiChoi) {
                return -1 * tienCuoc;
            } else {
                return tienCuoc;
            }
        } else if (tongNutCai <= 21 && tongNutNguoiChoi > 21) {
            return -1 * tienCuoc;
        } else if (tongNutCai > 21 && tongNutNguoiChoi <= 21) {
            return tienCuoc;
        } else {
            if (tongNutNguoiChoi >= 28) {
                return -1 * tienCuoc;
            } else {
                return 0;
            }
        }
    }
}
