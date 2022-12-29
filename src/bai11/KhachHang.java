package bai11;

import java.time.LocalDate;
import java.util.Arrays;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSoHienCo;

	public KhachHang(String maKH, String hoTenKH, int soLuongSoHienCo) {
		super();
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soLuongSoHienCo = soLuongSoHienCo;
		this.dsSoTietKiem = new SoTietKiem[50];
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public String getMaKH() {
		return maKH;
	}

	private void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}

	private void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
		this.dsSoTietKiem = dsSoTietKiem;
	}

	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}

	private void setSoLuongSoHienCo(int soLuongSoHienCo) {
		this.soLuongSoHienCo = soLuongSoHienCo;
	}

	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, double laiSuat)
	{
		if (soLuongSoHienCo < dsSoTietKiem.length)
		{
			dsSoTietKiem[soLuongSoHienCo] = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
			soLuongSoHienCo++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = String.format("Khach hang: %s - %s", maKH, hoTenKH);
		for (SoTietKiem ds : dsSoTietKiem)
		{
			s += ds + "\n";
		}
		return s;
	}
	
}
