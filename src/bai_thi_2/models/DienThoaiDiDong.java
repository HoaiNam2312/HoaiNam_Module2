package bai_thi_2.models;

public abstract class DienThoaiDiDong {
    private int id;
    private String tenDienThoai;
    private int giaBan;
    private int soLuong;
    private String nhaSanXuat;

    public DienThoaiDiDong() {
    }

    public DienThoaiDiDong(int id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public abstract String getInfo();

    public String getFile() {
        return id+","+tenDienThoai+","+giaBan+","+soLuong+","+nhaSanXuat;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'';
    }
}
