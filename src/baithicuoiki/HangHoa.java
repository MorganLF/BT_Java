package baithicuoiki;

import java.time.LocalDate;

public class HangHoa {
    private double giaNhap;
	private int slTonKho;
	private LocalDate ngayNhapKho;
    private String maHang;
    private Loai loai;
    private String tenHang;
	public HangHoa(Loai loai, String maHang, String tenHang, double giaNhap, int slTonKho, LocalDate ngayNhapKho) {
		this.loai = loai;
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.giaNhap = giaNhap;
		this.slTonKho = slTonKho;
		this.ngayNhapKho = ngayNhapKho;
	}

	@Override
	public String toString() {
		return "HangHoa{" + "loai=" + loai + ", maHang='" + maHang + '\'' + ", tenHang='" + tenHang + '\''
				+ ", giaNhap=" + giaNhap + ", slTonKho=" + slTonKho + ", ngayNhapKho=" + ngayNhapKho + '}';
	}

	public Loai getLoai() {
		return loai;
	}

	public void setLoai(Loai loai) {
		this.loai = loai;
	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSlTonKho() {
		return slTonKho;
	}

	public void setSlTonKho(int slTonKho) {
		this.slTonKho = slTonKho;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}

	public HangHoa() {
	}

	
}
    

