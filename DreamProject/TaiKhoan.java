public class TaiKhoan {
    private String tenTaiKhoan;
    private String matKhau;
    private int tienAo;

    public TaiKhoan() {

    }

    public TaiKhoan(String tenTaiKhoan, String matKhau, int tienAo) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.tienAo = tienAo;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getTienAo() {
        return tienAo;
    }

    public void setTienAo(int tienAo) {
        this.tienAo = tienAo;
    }

    public void hienThiTaiKhoan() {
        System.out.println("nguoi choi: " + tenTaiKhoan);
        System.out.println("tien trong tai khoan: " + tienAo);
    }

}
